package ar.com.onwave.equipos.datos;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/movistar";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "admin";
    private static BasicDataSource dataSource;

    public static DataSource getDataSource(){
        if (dataSource == null){
            dataSource = new BasicDataSource();
            dataSource.setUrl(JDBC_URL);
            dataSource.setUsername(JDBC_USER);
            dataSource.setPassword(JDBC_PASS);
            dataSource.setInitialSize(50);
        }
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close (Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
