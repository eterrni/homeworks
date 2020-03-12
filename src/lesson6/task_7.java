/*7.	Написать метод, который в 50% случаев бросает исключение.
          Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.
*/
package lesson6;

import java.util.Random;

public class task_7 {
    public static void main(String[] args) {
        try {
            throw_excaption();
        } catch (My_Excaption ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }

    private static void throw_excaption() throws My_Excaption {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n == 1) {
            throw new My_Excaption("50% chance worked");
        }
    }

    private static class My_Excaption extends Exception {
        private My_Excaption(String message) {
            super(message);
        }
    }
}
