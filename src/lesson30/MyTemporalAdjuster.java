package lesson30;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

public interface MyTemporalAdjuster {

    static TemporalAdjuster add42days(LocalDate today) {
        return today.plus(42, ChronoUnit.DAYS);
    }

    static TemporalAdjuster changeDate1stJanuary(LocalDate today) {
        if (today.getDayOfYear() < 183) {
            return firstJanOfThisYear(today);
        } else return firstJanOfNextYear(today);
    }

    private static TemporalAdjuster firstJanOfThisYear(LocalDate today) {
        int todayIsDay = today.getDayOfYear();


        return today.minus(todayIsDay - 1, ChronoUnit.DAYS);
    }

    private static TemporalAdjuster firstJanOfNextYear(LocalDate today) {
        int daysInYear = today.lengthOfYear();
        int todayIsDay = today.getDayOfYear();
        int leftDays = daysInYear - todayIsDay;

        return today.plus(leftDays + 1, ChronoUnit.DAYS);

    }
}
