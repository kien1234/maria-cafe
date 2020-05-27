/*
* InformationDAO.java
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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Information;

/**
 * InformationDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . getInformation
 *
 *
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class InformationDAO {

    /**
     * getInformation.<br>
     *
     * Lấy bản ghi top 1 của bảng Information trong database
     *
     * @return a information
     * @throws SQLException
     */
    public Information getInformation() throws SQLException {
        Information info = new Information();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT TOP(1) [ID]\n");
            sql.append("      ,[Title]\n");
            sql.append("      ,[Picture]\n");
            sql.append("      ,[ShortDescription]\n");
            sql.append("      ,[DetailDescription]\n");
            sql.append("      ,[Address]\n");
            sql.append("      ,[Tel]\n");
            sql.append("      ,[Email]\n");
            sql.append("      ,[OpeningHours]\n");
            sql.append("      ,[Map]\n");
            sql.append("  FROM [dbo].[Information]");
            conn = db.getConnection();
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery();
            if (rs.next()) {
                info.setId(rs.getInt("ID"));
                info.setTitle(rs.getString("Title"));
                info.setPicture(rs.getString("Picture"));
                info.setShortDescription(rs.getString("ShortDescription"));
                info.setDetailDescription(rs.getString("DetailDescription"));
                info.setAddress(rs.getString("Address"));
                info.setTel(rs.getString("Tel"));
                info.setEmail(rs.getString("Email"));
                info.setOpeningHours(rs.getString("OpeningHours"));
                info.setMap(rs.getString("Map"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InformationDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.closeConnection(rs, ps, conn);
        }
        return info;
    }
}
