// FileNotFoundExceptionDemo.java
import java.io.*;
import java.util.Scanner;
public class FileNotFoundExceptionDemo {
    public void demonstrate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file to open:");
        String fileName = scanner.nextLine();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught while closing file: " + e.getMessage());
        }
    }
}
