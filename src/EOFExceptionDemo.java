// EOFExceptionDemo.java
import java.io.*;
import java.util.Scanner;
public class EOFExceptionDemo {
    public void demonstrate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file to read until EOF:");
        String fileName = scanner.nextLine();
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
            while (true) {
                System.out.println(dis.readByte());
            }
        } catch (EOFException e) {
            System.out.println("EOFException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}