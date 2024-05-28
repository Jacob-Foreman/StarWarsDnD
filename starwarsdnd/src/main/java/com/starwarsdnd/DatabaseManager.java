package com.starwarsdnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Load the SQLite JDBC driver
                Class.forName("org.sqlite.JDBC");
                
                // Connect to the database (create a new database if it doesn't exist)
                connection = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");
                System.out.println("Connected to SQLite database.");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("Error connecting to SQLite database: " + e.getMessage());
            }
        }
        return connection;
    }

    // Other database handling methods can be added here
}

/**sample controller asking a query
 * 
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyController {
    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        try {
            Connection connection = DatabaseManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM my_table");
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                resultLabel.setText("Total records: " + count);
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error executing SQL query: " + e.getMessage());
        }
    }
}

 * 
 * 
 * 
 * 
 */

