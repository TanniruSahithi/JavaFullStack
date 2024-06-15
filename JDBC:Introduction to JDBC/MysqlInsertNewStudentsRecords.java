package jdbcintro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MysqlInsertNewStudentsRecords {
    // JDBC URL, username, and password of your MySQL database
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            // Prompt user to enter student details
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student age: ");
            int age = scanner.nextInt();

            // Prepare SQL statement to insert a new record
            String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setInt(3, age);

                // Execute the insert statement
                int rowsInserted = preparedStatement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new student record was inserted successfully.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}