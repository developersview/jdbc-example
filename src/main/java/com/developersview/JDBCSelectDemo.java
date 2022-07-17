package com.developersview;

import java.sql.*;

/**
 * @author pranoy.chakraborty
 * @Date 17/07/22
 */
public class JDBCSelectDemo {
    public static void main(String[] args) {
        //set dbURL, username and password
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Employees";
        String username = "sa";
        String password = "12345";

        //try catch block to handle sql exception
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

            String sql = "SELECT * FROM dbo.employees";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            System.out.println("Employee #number: id - first_name - last_name - emailid");
            System.out.println("----------------------------------------------------------");
            while (result.next()) {
                int id = result.getInt("id");
                String emailid = result.getString("emailid");
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");

                String output = "Employee #%d: %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, id, firstName, lastName, emailid));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
