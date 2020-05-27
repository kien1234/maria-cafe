/*
* ProductDAO.java
*
* All Right Reserved
* Copyright (c) 2019 FPT University
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 * ProductDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . getIdOfFirstProduct
 * . getOneProduct
 * . getTwoProductNew
 * . getTotalProduct
 * . getListProductPaging
 *
 *
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class ProductDAO {
    /**
     * Store db.
     */
    private final DBContext db;
    
    /**
     * Constructor no parameter.<br>
     */
    public ProductDAO() {
        this.db = new DBContext();
    }
    
    /**
     * getIdOfFirstProduct.<br>
     *
     * Lấy id của product đầu tiên trong database
     *
     * @return a id
     * @throws SQLException
     */
    public int getIdOfFirstProduct() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int id = -1;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT TOP(1) [ID]\n");
            sql.append("  FROM [dbo].[Product]\n");
            sql.append("  ORDER BY ID ASC\n");
            conn = db.getConnection();
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  finally {
            db.closeConnection(rs, ps, conn);
        }
        return id;
    }
    
    /**
     * getOneProduct.<br>
     *
     * Lấy 1 product trong database theo id
     *
     * @param id
     * @return a product
     * @throws SQLException
     */
    public Product getOneProduct(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT [ID]\n");
            sql.append("      ,[Name]\n");
            sql.append("      ,[Picture]\n");
            sql.append("      ,[ShortDescription]\n");
            sql.append("      ,[DetailDescription]\n");
            sql.append("      ,[Price]\n");
            sql.append("  FROM [dbo].[Product]\n");
            sql.append("  WHERE ID = ?");
            conn = db.getConnection();
            ps = conn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Product product = new Product(
                        rs.getInt("ID"),
                        rs.getString("Name"),
                        rs.getString("Picture"),
                        rs.getString("ShortDescription"),
                        rs.getString("DetailDescription"),
                        rs.getString("Price"));
                return product;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.closeConnection(rs, ps, conn);
        }
        return null;
    }
    
    /**
     * getTwoProductNew.<br>
     *
     * Lấy 2 product newest trong database
     *
     * @return a list product
     * @throws SQLException
     */
    public List<Product> getTwoProductNew() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Product> products = new ArrayList<>();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT TOP(2) [ID]\n");
            sql.append("      ,[Name]\n");
            sql.append("      ,[Picture]\n");
            sql.append("      ,[ShortDescription]\n");
            sql.append("      ,[DetailDescription]\n");
            sql.append("      ,[Price]\n");
            sql.append("  FROM [dbo].[Product]\n");
            sql.append("  ORDER BY DateCreated DESC");
            conn = db.getConnection();
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(
                        rs.getInt("ID"),
                        rs.getString("Name"),
                        rs.getString("Picture"),
                        rs.getString("ShortDescription"),
                        rs.getString("DetailDescription"),
                        rs.getString("Price"));
                products.add(p);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.closeConnection(rs, ps, conn);
        }
        return products;
    }
    
    /**
     * getTotalProduct.<br>
     *
     * Lấy tổng số lượng product trong database
     *
     * @return total
     * @throws SQLException
     */
    public int getTotalProduct() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int total = 0;
        try {
            String sql = "SELECT COUNT(id) AS total FROM [dbo].[Product]";
            conn = db.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  finally {
            db.closeConnection(rs, ps, conn);
        }
        return total;
    }
    
    /**
     * getListProductPaging.<br>
     *
     * Lấy 1 list product trong database theo pageIndex, pageSize
     *
     * @param pageIndex
     * @param pageSize
     * @return a list
     * @throws SQLException
     */
    public List<Product> getListProductPaging(int pageIndex, int pageSize) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Product> products = new ArrayList<>();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT [ID]\n");
            sql.append("      ,[Name]\n");
            sql.append("      ,[Picture]\n");
            sql.append("      ,[ShortDescription]\n");
            sql.append("      ,[DetailDescription]\n");
            sql.append("      ,[Price]\n");
            sql.append("FROM (\n");
            sql.append("SELECT ROW_NUMBER() OVER (ORDER by ID ASC) as rn, *\n");
            sql.append("FROM Product\n");
            sql.append(")AS x\n");
            sql.append("WHERE rn BETWEEN (?-1)*?+1 AND ?*?");
            conn = db.getConnection();
            ps = conn.prepareStatement(sql.toString());
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageIndex);
            ps.setInt(4, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(
                        rs.getInt("ID"),
                        rs.getString("Name"),
                        rs.getString("Picture"),
                        rs.getString("ShortDescription"),
                        rs.getString("DetailDescription"),
                        rs.getString("Price"));
                products.add(p);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  finally {
            db.closeConnection(rs, ps, conn);
        }
        return products;
    }
}
