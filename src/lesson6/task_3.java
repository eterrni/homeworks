/*3.	Создать собственный класс-исключение - наследник класса Exception.
          Создать метод, выбрасывающий это исключение.
          Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
*/
package lesson6;

public class task_3 {
    public static void main(String[] args) {
        try {
            throwExcaption();
        } catch (MyClassException e) {
            e.printStackTrace();
        }
    }

    static void throwExcaption() throws MyClassException {
        throw new MyClassException();
    }

    private static class MyClassException extends Exception {
    }
}


