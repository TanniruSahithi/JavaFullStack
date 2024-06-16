package connectingtodb;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.SQLException; 
import java.util.Scanner; 
public class OracleDelete { 
// JDBC URL, username, and password of Oracle database 
private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";  
private static final String USERNAME = "system"; 
private static final String PASSWORD = "system"; 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter order id to delete: "); 
int orderId = scanner.nextInt(); 
 
        try (Connection connection = DriverManager.getConnection(JDBC_URL, 
USERNAME, PASSWORD)) { 
            // Prepare SQL statement to delete an order 
            String sql = "DELETE FROM orders WHERE order_id = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql); 
            statement.setInt(1, orderId); 
 
            // Execute the delete statement 
            int rowsDeleted = statement.executeUpdate(); 
 
            if (rowsDeleted > 0) { 
                System.out.println("Order deleted successfully."); 
            } else { 
                System.out.println("No such order found with id: " + orderId); 
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
