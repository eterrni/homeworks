/*1.	Объявите переменную со значением null. Вызовите метод у этой переменной.
Отловите возникшее исключение.
*/
package lesson6;

public class task_1 {
    public static void main(String[] args) {
        String s = null;
        try {
            s.length();
        } catch (NullPointerException e) {
            s = "qwe";
        }
        System.out.println(s);
    }
}
