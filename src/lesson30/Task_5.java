package lesson30;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/*5.Создать объект LocalDate, представляющий собой сегодняшнюю дату.
Создать объект LocalDate, представляющий собой дату 25.06.2020.
Используя созданные объекты, найти количество дней между этими двумя датами.*/
public class Task_5 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate localDate = LocalDate.of(2020, 6, 25);

        LocalDateTime todayMidnight = today.atStartOfDay();
        LocalDateTime localDateMidnight = localDate.atStartOfDay();

        Duration durationOfDays = Duration.between(todayMidnight, localDateMidnight);
        System.out.println(durationOfDays.toDays());
    }
}
