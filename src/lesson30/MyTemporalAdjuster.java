package lesson30;

import java.time.temporal.TemporalAdjuster;

public interface MyTemporalAdjuster {
    TemporalAdjuster add42days();

    TemporalAdjuster changeDate1stJanuary();
}
