package lesson14;

import lesson14_new.StreamApiHomework;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class StreamApiTest {
    private StreamApiHomework streamApiHomework = new StreamApiHomework();

    /*1.Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.*/
    @Test
    public void Task_1_Test() {
        List<Integer> numbers = Arrays.asList(12, -2, 13, 10, 20, 25, 35, 0);
        double expected = 30.0;
        double actual = streamApiHomework.task_1(numbers);
        Assert.assertEquals(expected, actual, 0.01);
        System.out.println(actual);
    }

    /*2.Дан список строк. Найти количество уникальных строк длиной более 8 символов.*/
    @Test
    public void Task_2_Test() {
        List<String> stringList = Arrays.asList("qwertyuio", "b", "c", "a", "qwertyuio", "qwertyu", "qwertyuiop", "qwertyuiop");
        double expectedCount = 2.0;
        double actualCount = streamApiHomework.task_2(stringList);
        Assert.assertEquals(expectedCount, actualCount, 0.01);

        System.out.println(actualCount);
    }

    /*3.Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.*/
    @Test
    public void Task_3_Test() {
        Map<String, Integer> map = Map.of(
                "Anna", 27,
                "Alexander", 20,
                "Alla", 13
        );
        long expectedSum = 40;
        long actualSum = streamApiHomework.task_3(map);

        Assert.assertEquals(expectedSum, actualSum);
        System.out.println(actualSum);
    }

    /* 4.Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
    Пример: список {5, 2, 4, 2, 1}
    Результирующая строка: "52421" */
    @Test
    public void Task_4_Test() {
        List<Integer> numbers = Arrays.asList(5, 2, 4, 2, 1);
        String expected = "52421";
        String actual = streamApiHomework.task_4(numbers);

        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }

    /*5.Дан класс Person с полями firstName, lastName, age.
    Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов. */
    @Test
    public void Task_5_Test() {
        ArrayList<Person> list_persons = new ArrayList<>();
        Person person_1 = new Person("Ivan", "Prydnikov", 23);
        Person person_2 = new Person("Alexander", "Novikov", 19);
        Person person_3 = new Person("Ilya", "Miranchyk", 21);
        list_persons.add(person_1);
        list_persons.add(person_2);
        list_persons.add(person_3);

        Optional<Person> expected = Optional.of(person_1);
        Optional<Person> actual = streamApiHomework.getOldestPersonName(list_persons);

        Assert.assertEquals(expected, actual);
        System.out.println(actual);

    }
}
