/*3. Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры,
например <p id ="p1">, и замену их на простые теги абзацев <p>.
*/
package lesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str.replaceAll("<[p]{1}[0-9]+>","<p>"));
    }
}
