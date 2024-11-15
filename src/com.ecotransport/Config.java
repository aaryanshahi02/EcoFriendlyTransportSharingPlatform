package com.ecotransport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    public static final String URL = "jdbc:mysql://localhost:3306/eco_transport";
    public static final String USER = "yourUsername";
    public static final String PASSWORD = "yourPassword";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
