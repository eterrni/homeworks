package lesson30;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

/*7.Написать свою реализацию интерфейса TemporalAdjuster, которая бы прибавляла к дате 42 дня*/
public interface MyTemporalAdjuster {
    TemporalAdjuster add42days();

    TemporalAdjuster changeDate1stJanuary();
}
