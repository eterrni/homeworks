package lesson30;

import java.time.LocalDate;

/*2.Создать объект LocalDate, представляющий собой сегодняшнюю дату.
Используя этот объект, создать другой объект LocalTime, представляющий собой
дату через 3 месяца после сегодняшней. Вывести эту дату в консоль.*/
public class Task_2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate newLocalDate = today.plusMonths(3);
        System.out.println(newLocalDate);
    }
}
