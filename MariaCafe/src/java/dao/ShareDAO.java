/*
* ShareDAO.java
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
import model.Share;

/**
 * ShareDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . getShare
 *
 *
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class ShareDAO {
    
    /**
     * getShare.<br>
     *
     * Lấy tất cả các bản ghi của bảng Share trong database
     *
     * @return a list
     * @throws SQLException
     */
    public List<Share> getShare() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        List<Share> shares = new ArrayList<>();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT [Icon]\n");
            sql.append("      ,[SocialNetwork]\n");
            sql.append("      ,[URL]\n");
            sql.append("  FROM [dbo].[Share]\n");
            conn = db.getConnection();
            ps = conn.prepareStatement(sql.toString());
            rs = ps.executeQuery();
            while (rs.next()) {
                Share share = new Share(rs.getString("Icon"),
                        rs.getString("SocialNetwork"),
                        rs.getString("URL"));
                shares.add(share);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShareDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.closeConnection(rs, ps, conn);
        }
        return shares;
    }
}
