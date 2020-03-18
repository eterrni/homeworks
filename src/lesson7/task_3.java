/*3. Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true,
если строка начинается и заканчивается этим словом.*/
package lesson7;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String w = scan.next();
        System.out.println(stringAndWord(s, w));
    }

    private static boolean stringAndWord(String s, String w) {
        return s.startsWith(w) && s.endsWith(w);
    }
}
