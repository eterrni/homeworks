package lesson14_new;

import lesson14.Person;

import java.util.*;
import java.util.stream.Collectors;


public class StreamApiHomework {

    public double task_1(List<Integer> numbers) {
        double result = numbers.stream()
                .filter((number) -> number % 2 != 0 && number % 5 == 0)
                .mapToInt((number) -> number)
                .average().orElse(0);
        return result;
    }

    public double task_2(List<String> stringList) {
        double count = stringList.stream()
                .filter((s -> s.length() > 8))
                .distinct()
                .count();
        return count;
    }

    public long task_3(Map<String, Integer> map) {
        return map.entrySet().stream()
                .filter(pair -> pair.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
    }

    public String task_4(List<Integer> numbers) {
        String result = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        return result;
    }

    public Optional<Person> getOldestPersonName(List<Person> list_persons) {
        return list_persons.stream()
                .filter(Objects::nonNull)
                .filter(person -> person.getLastName().length() + person.getFirstName().length() <= 15)
                .max(Comparator.comparingInt(Person::getAge));
    }
}
