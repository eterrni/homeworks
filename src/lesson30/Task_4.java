package lesson30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*4.Дана строка вида "26-03-2014". Получить объект LocalDate, представляющий собой дату, полученную из этой строки.*/
public class Task_4 {
    public static void main(String[] args) {
        String dateAsString = "26-03-2014";
        LocalDate parsedDate = LocalDate.parse(dateAsString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(parsedDate.getDayOfMonth() + "." + parsedDate.getMonthValue() + "." + parsedDate.getYear());
    }
}
