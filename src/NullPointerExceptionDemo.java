// NullPointerExceptionDemo.java
import java.util.Scanner;
public class NullPointerExceptionDemo {
    public void demonstrate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (or press Enter to simulate null):");
        String str = scanner.nextLine();
        try {
            if (str.isEmpty()) {
                str = null;
            }
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}