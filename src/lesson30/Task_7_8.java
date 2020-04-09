package lesson30;

import java.time.LocalDate;

/* 7.Написать свою реализацию интерфейса TemporalAdjuster, которая бы прибавляла к дате 42 дня
   8.(*) Написать свою реализацию интерфейса TemporalAdjuster, которая бы изменяла дату на ближайшее (в днях) 1 января.*/
public class Task_7_8 implements MyTemporalAdjuster {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(MyTemporalAdjuster.add42days(today));
        System.out.println(MyTemporalAdjuster.changeDate1stJanuary(today));
    }
}
