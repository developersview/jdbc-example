package com.developersview;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author pranoy.chakraborty
 * @Date 17/07/22
 */
public class JDBCSqlServerConnection {
    public static void main(String[] args) {
        //create connection object
        Connection connection = null;
        try {
            //set dbURL, username and password
            String dbURL = "jdbc:sqlserver://localhost:1433";
            String username = "sa";
            String password = "12345";

            //establish connection
            connection = DriverManager.getConnection(dbURL, username, password);
            if (connection != null) {
                DatabaseMetaData databaseMetaData = connection.getMetaData();
                System.out.println("Driver Name : " + databaseMetaData.getDriverName());
                System.out.println("Driver Version : " + databaseMetaData.getDriverVersion());
                System.out.println("Product Name : " + databaseMetaData.getDatabaseProductName());
                System.out.println("Product Version : " + databaseMetaData.getDatabaseProductVersion());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                //closing sql connection
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
