/*
* DBContext.java
*
* All Right Reserved
* Copyright (c) 2019 FPT University
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DBContext.<br>
 *
 * <pre>
 * Class mở kết nối đến SQLServer
 * Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * 1 hàm getConnection() trả về Connection để lấy kết nối đến server
 * 1 hàm closeConnection() để đóng kết nối
 *
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class DBContext {

    /**
     * getConnection <br>
     * 
     * Mở kết nối tới SQLServer
     * Trường hợp gặp lỗi thực hiện exception.
     * 
     * @return connection
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    private final String serverName = "localhost";
    private final String dbName = "MariaCafe";
    private final String portNumber = "1433";
    private final String userID = "sa";
    private final String password = "123456789";
    
    /**
     * closeConnection <br>
     * 
     * Thực hiện việc đóng kết nối nếu bị lỗi thực hiện exception
     * 
     * @param rs
     * @param ps
     * @param con
     * @throws SQLException 
     */
    public void closeConnection(ResultSet rs, PreparedStatement ps, Connection con) throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}

