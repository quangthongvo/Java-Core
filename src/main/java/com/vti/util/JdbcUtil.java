package com.vti.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JdbcUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/lesson_10";
        String user = "root";
        String password = "root";
        return DriverManager.getConnection(url, user, password);
    }
    public static void checkConnection() throws SQLException {
        try (Connection connection = getConnection()){
            System.out.println("ket noi thanh cong : " + connection.getCatalog());
        }catch (SQLException exception){
            System.out.println("ket noi that bai : " + exception.getMessage());
        }

    }

}
