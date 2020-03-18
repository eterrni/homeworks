/*5. Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.*/
package lesson7;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int count = a.split(" +").length;
        System.out.println("кол-во слов: "+count);
    }
}
