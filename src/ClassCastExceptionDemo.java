// ClassCastExceptionDemo.java
public class ClassCastExceptionDemo {
    public void demonstrate() {
        try {
            Object obj = "This is a string";
            Integer number = (Integer) obj; // Invalid cast
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}