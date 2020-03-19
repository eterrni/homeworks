/*1. Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы.
Возможные домены верхнего уровня: .org .com
*/
package lesson8;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if (str.matches("^[A-Za-z][A-Za-z0-9_]+@[a-z]+\\.(com|org)")) {
            System.out.println("Является мейлом");
        } else {
            System.out.println("Не является мейлом");
        }
    }
}