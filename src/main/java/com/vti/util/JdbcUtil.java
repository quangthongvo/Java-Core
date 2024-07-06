package com.vti.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
    public static Connection getConnection() throws SQLException, IOException {
        String path = "src/main/resources/database.properties";
        try (FileInputStream fis = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(fis);
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            return DriverManager.getConnection(url, user, password);
        }
    }

    public static void checkConnection() {
        try (Connection connection = getConnection()) {
            System.out.println("ket noi thanh cong : " + connection.getCatalog());
        } catch (SQLException | IOException exception) {
            System.out.println("ket noi that bai : " + exception.getMessage());
        }

    }
}
