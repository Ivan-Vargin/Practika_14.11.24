package MyPackage;

public class ThrowsDemo2 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in printMessage: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        try {
            demo.printMessage(null);  // Вызов с null
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
        try {
            demo.printMessage("exampleKey");  // Вызов с корректным ключом
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }
}
//Блок try-catch в методе printMessage():
//
//Обработка исключения NullPointerException: Если параметр key равен null, выбрасывается исключение NullPointerException в методе getDetails().
// Это исключение перехватывается в методе printMessage() и выводится сообщение "Caught NullPointerException in printMessage: null key in getDetails"
