package lesson30;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

/* 7.Написать свою реализацию интерфейса TemporalAdjuster, которая бы прибавляла к дате 42 дня
   8.(*) Написать свою реализацию интерфейса TemporalAdjuster, которая бы изменяла дату на ближайшее (в днях) 1 января.*/
public class Task_7_8 implements MyTemporalAdjuster {
    @Override
    public TemporalAdjuster add42days() {
        LocalDate today = LocalDate.now();
        return today.plus(42, ChronoUnit.DAYS);
    }

    @Override
    public TemporalAdjuster changeDate1stJanuary() {
        LocalDate today = LocalDate.now();

        int daysInYear = today.lengthOfYear();
        int todayIsDay = today.getDayOfYear();
        int leftDays = daysInYear - todayIsDay;

        return today.plus(leftDays + 1, ChronoUnit.DAYS);
    }

    public static void main(String[] args) {
        Task_7_8 task_7_8 = new Task_7_8();
        System.out.println(task_7_8.add42days());
        System.out.println(task_7_8.changeDate1stJanuary());
    }
}
