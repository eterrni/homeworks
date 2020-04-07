package lesson14;


import java.util.Arrays;
import java.util.List;


/*1.Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.*/
public class task_1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, -2, 13, 10, 20, 25, 35, 0);

        double result = numbers.stream()
                .filter((number) -> number % 2 != 0 && number % 5 == 0)
                .mapToInt((number) -> number)
                .average().orElse(0);

        System.out.println(result);

    }
}
