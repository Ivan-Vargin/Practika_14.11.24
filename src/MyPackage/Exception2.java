package MyPackage;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введены некорректные данные. Введите целое число.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль недопустимо.");
        }
    }

    public static void main(String[] args) {
        Exception2 exception = new Exception2();
        exception.exceptionDemo();
    }
}
//Использование конструкции try-catch позволяет элегантно обрабатывать различные типы исключений в Java,
// предотвращая аварийное завершение программы и обеспечивая выполнение критических операций независимо от возникновения исключений.
// В данном примере мы обрабатываем два основных типа исключений: NumberFormatException (недопустимый ввод для преобразования в целое число) и ArithmeticException (деление на ноль).

