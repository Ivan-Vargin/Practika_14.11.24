package MyPackage;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0); // Код, который может вызвать исключение
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 exception = new Exception1();
        exception.exceptionDemo();
    }
}
//Когда программа выполняется, метод exceptionDemo() выполняет оператор 2 / 0.
// Это приводит к возникновению исключения ArithmeticException.
// Поскольку try...catch блок обрабатывает это исключение, программа не аварийно завершается.
// Вместо этого, выполняется код в блоке catch, и выводится сообщение “Attempted division by zero”.
// После этого, программа продолжает выполнение дальше, если такой код есть.
