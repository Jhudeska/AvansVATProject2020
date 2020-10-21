package com.ignacia.VAT.Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by jhudeska on Oct, 2020
 */
public class ConnectJDBC {

    private static Connection connection;

    public static Connection connect() {
        if (connection != null) {
            return connection;
        }

        String userName = "root";
        String password = "";
        String url = "jdbc:mysql://127.0.0.1/VATdb?useSSL=false&useUnicode=true&serverTimezone=UTC";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            return connection;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }
}
