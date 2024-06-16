package connectingtodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MysqlUpdate {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product id: ");
        int productId = scanner.nextInt();
        System.out.print("Enter new price: ");
        double newPrice = scanner.nextDouble();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            // Prepare SQL statement to update the price of a product
            String sql = "UPDATE products SET price = ? WHERE product_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, newPrice);
            statement.setInt(2, productId);

            // Execute the update statement
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("No such product found with id: " + productId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
