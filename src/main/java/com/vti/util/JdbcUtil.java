package com.vti.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/lesson_11";
        String user = "root";
        String password = "thong2002@";
        return DriverManager.getConnection(url, user, password);
    }
    public static void checkConnection(){
        try(Connection connection = getConnection()){
            System.out.println("Ket noi thanh cong " + connection.getCatalog());
        }catch (SQLException exception){
            System.err.println("Ket noi that bai " + exception.getMessage());
        }
    }
}
