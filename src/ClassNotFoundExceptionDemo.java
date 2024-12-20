// ClassNotFoundExceptionDemo.java
import java.util.Scanner;
public class ClassNotFoundExceptionDemo {
    public void demonstrate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the class to load:");
        String className = scanner.nextLine();
        try {
            Class.forName(className);
            System.out.println("Class loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
}