/*4.	Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
Добавить вконструктор своего класса возможность указания сообщения.
*/
package lesson6;

public class task_4 {
    public static void main(String[] args) {
        try {
            throw_Excaption();
        } catch (My_Class_Exception e) {
            e.printStackTrace();
        }

    }

    static void throw_Excaption() throws My_Class_Exception {
        throw new My_Class_Exception("Message");
    }

    static class My_Class_Exception extends RuntimeException {
        public My_Class_Exception(String message) {
            super(message);
        }
    }
}

