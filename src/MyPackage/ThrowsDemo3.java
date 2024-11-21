package MyPackage;
import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Caught exception in getKey: " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo3 demo = new ThrowsDemo3();
        demo.getKey();
    }
}

//Блок try-catch в методе getKey(): Метод getKey() содержит блок try-catch, который обрабатывает исключение, выброшенное методом printDetails().
// Это позволяет программе продолжить выполнение, даже если возникло исключение.
//
//Объявление исключения в методе printDetails(): Метод printDetails() объявляет, что он может выбросить исключение Exception,
// что позволяет компилятору Java проверить, что вызывающий метод (в данном случае getKey()) правильно обрабатывает исключение.
