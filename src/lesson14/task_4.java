package lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 4.Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
Пример: список {5, 2, 4, 2, 1}
Результирующая строка: "52421" */
public class task_4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 4, 2, 1);

        String result = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
