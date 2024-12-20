// SQLExceptionDemo.java
import java.sql.*;
import java.util.Scanner;
public class SQLExceptionDemo {
    public void demonstrate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter database URL:");
        String dbUrl = scanner.nextLine();
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        try {
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }
}