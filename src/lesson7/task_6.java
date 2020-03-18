/*6. Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
Пример: aaabbcdeef ->abcdef */
package lesson7;

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char a = str.charAt(0);
        StringBuilder outputStr = new StringBuilder(String.valueOf(a));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != a) {
                a = str.charAt(i);
                outputStr.append(str.charAt(i));
            }
        }
        System.out.println(outputStr);
    }
}