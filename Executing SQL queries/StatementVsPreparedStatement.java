package executingsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementVsPreparedStatement {

    // JDBC URL, username, and password of your database
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            createTable(connection);  // Create a table if not exists
            
            // Demo using Statement
            System.out.println("Using Statement:");
            demoStatement(connection);
            
            // Demo using PreparedStatement
            System.out.println("\nUsing PreparedStatement:");
            demoPreparedStatement(connection);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private static void createTable(Connection connection) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS employees ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY,"
                   + "name VARCHAR(100),"
                   + "age INT)";
        
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Table 'employees' created (if not existed).");
        }
    }

    private static void demoStatement(Connection connection) throws SQLException {
        // Example with Statement (Unsafe for user input)
        try (Statement statement = connection.createStatement()) {
            // Inserting data with Statement (Unsafe)
            String name = "John";
            int age = 30;
            String insertSql = "INSERT INTO employees (name, age) VALUES ('" + name + "', " + age + ")";
            statement.executeUpdate(insertSql);

            // Retrieving data with Statement
            String selectSql = "SELECT * FROM employees";
            try (ResultSet resultSet = statement.executeQuery(selectSql)) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String empName = resultSet.getString("name");
                    int empAge = resultSet.getInt("age");
                    System.out.println("ID: " + id + ", Name: " + empName + ", Age: " + empAge);
                }
            }
        }
    }

    private static void demoPreparedStatement(Connection connection) throws SQLException {
        // Example with PreparedStatement (Safe for user input)
        String insertSql = "INSERT INTO employees (name, age) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSql)) {
            // Inserting data with PreparedStatement
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee age: ");
            int age = scanner.nextInt();
            
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee added successfully.");
            }

            // Retrieving data with PreparedStatement
            String selectSql = "SELECT * FROM employees";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectSql)) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String empName = resultSet.getString("name");
                    int empAge = resultSet.getInt("age");
                    System.out.println("ID: " + id + ", Name: " + empName + ", Age: " + empAge);
                }
            }
        }
    }
}
