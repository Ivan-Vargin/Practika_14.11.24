package MyPackage;

import java.util.Scanner;

public class ThrowsDemo4 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean validKey = false;
        while (!validKey) {
            try {
                System.out.print("Enter a key: ");
                String key = myScanner.next();
                printDetails(key);
                validKey = true;
            } catch (Exception e) {
                System.out.println("Invalid key. Please try again.");
            }
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
        ThrowsDemo4 demo = new ThrowsDemo4();
        demo.getKey();
    }
}

//Программа запрашивает ввод ключа.
//
//Ввод пустой строки: Если пользователь вводит пустую строку, программа выводит сообщение "Invalid key. Please try again." и запрашивает ввод ключа снова.
//
//Ввод корректного ключа: Если пользователь вводит корректный ключ, программа выводит сообщение "data for <ключ>" и завершает выполнение.


//Блок try-catch в методе getKey(): Метод getKey() содержит блок try-catch, который обрабатывает исключение, выброшенное методом printDetails().
// Это позволяет программе продолжить выполнение, даже если возникло исключение.
//
//Цикл while в методе getKey(): Цикл while продолжает запрашивать ввод ключа до тех пор,
// пока пользователь не введет корректное значение.
// Это предотвращает аварийное завершение программы и дает пользователю еще один шанс на ввод.
