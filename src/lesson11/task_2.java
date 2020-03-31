/*2. Написать метод isUnique, который принимает Map<String, String> и возвращает true,
если два различных ключа не соответствуют двум одинаковым значениям.
*/
package lesson11;

import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        Map<String, String> map_true = new HashMap<>();
        map_true.put("Marty", "Stepp");
        map_true.put("Stuart", "Reges");
        map_true.put("Jessica", "Miller");
        Map<String, String> map_false = new HashMap<>();
        map_false.put("Kendrick", "Perkins");
        map_false.put("Stuart", "Reges");
        map_false.put("Bruce", "Reges");
        System.out.println(isUnique(map_true));
        System.out.println(isUnique(map_false));
    }

    private static boolean isUnique(Map<String, String> map) {
        ArrayList<String> values = new ArrayList<>(map.values());
        Set<String> set = new HashSet<>(values);
        return set.size() == values.size();
    }
}
