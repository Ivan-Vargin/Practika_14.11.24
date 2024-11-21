package MyPackage;
import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: not an integer");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred");
        }
    }
    public static void main(String[] args) {
        Exception3 exception = new Exception3();
        exception.exceptionDemo();
    }
}
//Правильный порядок блоков catch в конструкции try-catch позволяет эффективно обрабатывать различные типы исключений,
// предотвращая перехват общим блоком catch исключений,которые могли бы быть обработаны более специфичными блоками catch.
