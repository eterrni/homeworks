package lesson30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*3.Создать объект LocalDate, представляющий собой сегодняшнюю дату.
Преобразовать дату в строку вида "05.05.2017". Вывести эту строку в консоль*/
public class Task_3 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String formattedString = now.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(formattedString);
    }
}
