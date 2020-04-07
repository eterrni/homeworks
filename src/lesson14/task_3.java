package lesson14;

import java.util.HashMap;
import java.util.Map;

/*3.Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.*/
public class task_3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Anna", 27);
        map.put("Alexander", 20);
        map.put("Alla", 13);
        System.out.println(getSum(map));
    }

    public static long getSum(Map<String, Integer> map) {
        return map.entrySet().stream()
                .filter(pair -> pair.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();

    }
}
