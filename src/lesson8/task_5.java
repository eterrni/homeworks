/*5. Написать метод, который проверяет, является ли строка адресом IPv4.
Пример корректных IPv4
0.0.0.0
0.0.1.0
255.0.0.1
255.55.255.255
192.168.0.1

Не корректный
001.0.0.0
256.1.1.1
1.1.1.1.
-1.0.-1.1
*/
package lesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_5 {
    public static final String IP_PATTERN = "(1\\d\\d|[0]|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ip = scan.next();
        System.out.println(checkIp(ip));
    }

    static boolean checkIp(String str) {
        Pattern pattern = Pattern.compile(IP_PATTERN);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

}
