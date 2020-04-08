package lesson30;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/*6.Даны два объекта LocalDate из предыдущего задания. Подсчитать количество секунд между полуночью первой даты и полуночью второй даты.*/
public class Task_6 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate localDate = LocalDate.of(2020, 6, 25);

        LocalDateTime todayMidnight = today.atStartOfDay();
        LocalDateTime localDateMidnight = localDate.atStartOfDay();

        Duration durationOfSeconds = Duration.between(todayMidnight, localDateMidnight);
        System.out.println(durationOfSeconds.toSeconds());
    }
}
