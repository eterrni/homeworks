/*2. Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
с помощью регулярных выражений и выводящую их на страницу.
*/
package lesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Pattern p = Pattern.compile("0x[a-fA-F0-9]{1,4}");
        Matcher matcher = p.matcher(str);
        while(matcher.find()){
            System.out.println(str.substring(matcher.start(),matcher.end()));
        }
    }
}