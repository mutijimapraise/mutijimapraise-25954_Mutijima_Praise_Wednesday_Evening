// IOExceptionDemo.java
import java.io.*;
import java.util.Scanner;
public class IOExceptionDemo {
    public void demonstrate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file to read:");
        String fileName = scanner.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            System.out.println("File content: " + reader.readLine());
            reader.close();
        } catch (java.io.IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}