// IllegalArgumentExceptionDemo.java
import java.util.Scanner;
public class IllegalArgumentExceptionDemo {
    public void demonstrate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a thread priority (1-10):");
        try {
            int priority = scanner.nextInt();
            Thread thread = new Thread();
            thread.setPriority(priority);
            System.out.println("Thread priority set to: " + priority);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
}