package com.developersview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author pranoy.chakraborty
 * @Date 17/07/22
 */
public class JDBCDeleteDemo {
    public static void main(String[] args) {
        //set dbURL, username and password
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Employees";
        String username = "sa";
        String password = "12345";

        //try catch block to handle sql exception
        try(Connection connection = DriverManager.getConnection(dbURL,username,password)){
            String sql = "DELETE FROM employees WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"6");
            int rowInserted = preparedStatement.executeUpdate();
            if (rowInserted > 0) System.out.println("A existing employee has been deleted successfully!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
