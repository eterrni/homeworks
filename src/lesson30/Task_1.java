package lesson30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*1.Создать объект класса LocalDate, представляющий собой дату 25.06.2020. Вывести полученную дату в консоль*/
public class Task_1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2020, 6, 25);
        System.out.println(now);
    }
}
