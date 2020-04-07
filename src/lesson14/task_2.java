package lesson14;

import java.util.Arrays;
import java.util.List;

/*2.Дан список строк. Найти количество уникальных строк длиной более 8 символов.*/
public class task_2 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("qwertyuio", "b", "c", "a", "qwertyuio", "qwertyu", "qwertyuiop", "qwertyuiop");

        double count = stringList.stream()
                .filter((s -> s.length() > 8))
                .distinct()
                .count();

        System.out.println(count);

    }
}
