/*6.	Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
          Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
*/
package lesson6;

import java.util.Random;

public class task_6 {
    public static void main(String[] args) {
        try {
            random_throw_MyExcaption();
        } catch (first_Excaption | second_Excaption | third_Excaption ex) {
            ex.printStackTrace();
        }
    }

    private static void random_throw_MyExcaption() throws first_Excaption, second_Excaption, third_Excaption {
        Random rand = new Random();
        int n = rand.nextInt(3);
        if (n == 1) {
            throw new first_Excaption("first");
        } else if (n == 2) {
            throw new second_Excaption("second");
        } else throw new third_Excaption("third");
    }

    private static class first_Excaption extends Exception {
        private first_Excaption(String message) {
            super(message);
        }
    }

    private static class second_Excaption extends Exception {
        private second_Excaption(String message) {
            super(message);
        }
    }

    private static class third_Excaption extends Exception {
        private third_Excaption(String message) {
            super(message);
        }
    }
}



