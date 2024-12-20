// ExceptionHandlerMain.java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an exception to demonstrate with a real-life scenario:");
            System.out.println("1. IOException");
            System.out.println("2. FileNotFoundException");
            System.out.println("3. EOFException");
            System.out.println("4. SQLException");
            System.out.println("5. ClassNotFoundException");
            System.out.println("6. ArithmeticException");
            System.out.println("7. NullPointerException");
            System.out.println("8. ArrayIndexOutOfBoundsException");
            System.out.println("9. ClassCastException");
            System.out.println("10. IllegalArgumentException");
            System.out.println("11. NumberFormatException");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    new IOExceptionDemo().demonstrate();
                    break;
                case 2:
                    new FileNotFoundExceptionDemo().demonstrate();
                    break;
                case 3:
                    new EOFExceptionDemo().demonstrate();
                    break;
                case 4:
                    new SQLExceptionDemo().demonstrate();
                    break;
                case 5:
                    new ClassNotFoundExceptionDemo().demonstrate();
                    break;
                case 6:
                    new ArithmeticExceptionDemo().demonstrate();
                    break;
                case 7:
                    new NullPointerExceptionDemo().demonstrate();
                    break;
                case 8:
                    new ArrayIndexOutOfBoundsExceptionDemo().demonstrate();
                    break;
                case 9:
                    new ClassCastExceptionDemo().demonstrate();
                    break;
                case 10:
                    new IllegalArgumentExceptionDemo().demonstrate();
                    break;
                case 11:
                    new NumberFormatExceptionDemo().demonstrate();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
