// NumberFormatExceptionDemo.java
import java.util.Scanner;
public class NumberFormatExceptionDemo {
    public void demonstrate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid number:");
        try {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}