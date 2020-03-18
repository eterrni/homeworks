/*1. Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.
*/
package lesson7;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class task_1 {
    public static void main(String[] args) {
        String str_1 = " ";
        long start = new Date().getTime();
        LocalTime t1 = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            str_1 += i;
        }
        LocalTime t2 = LocalTime.now();
        Duration between = Duration.between(t2, t1);
        long l_1 = between.get(ChronoUnit.NANOS);
        System.out.println(l_1);

        StringBuilder str_2 = new StringBuilder(" ");
        long start_2 = new Date().getTime();
        LocalTime t3 = LocalTime.now();
        for (int i = 0; i < 100000; i++) {
            str_2.append(i);
        }
        LocalTime t4 = LocalTime.now();
        Duration between_2 = Duration.between(t4, t3);
        long l_2 = between.get(ChronoUnit.NANOS);
        System.out.println(l_2);
        System.out.println(l_2 - l_1);
    }
}