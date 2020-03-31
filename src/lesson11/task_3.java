/*3. Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в двух объектах HashMap в виде:
Ключ: номер степени
Значение: значение множителя

Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8
*/
package lesson11;

import java.util.*;

/**/
public class task_3 {
    public static void main(String[] args) {

        Map<Integer, Integer> map_1 = new HashMap<>();
        map_1.put(3, 5);
        map_1.put(2, 1);
        map_1.put(1, 1);
        TreeSet<Integer> treeSet_1 = new TreeSet<>(map_1.keySet());
        Iterator<Integer> iterator_1 = treeSet_1.iterator();
        StringBuilder str_1 = new StringBuilder();

        Map<Integer, Integer> map_2 = new HashMap<>();
        map_2.put(3, 3);
        map_2.put(2, 2);
        map_2.put(4, 2);
        TreeSet<Integer> treeSet_2 = new TreeSet<>(map_2.keySet());
        Iterator<Integer> iterator_2 = treeSet_2.iterator();
        StringBuilder str_2 = new StringBuilder();

        Map<Integer, Integer> map_res = new HashMap<>();

        while (iterator_1.hasNext()) {
            Integer key_1 = iterator_1.next();
            str_1.append(map_1.get(key_1)).append("x^").append(key_1).append("+");
            if (map_2.containsKey(key_1)) {
                map_res.put(key_1, map_1.get(key_1) + map_2.get(key_1));
            } else {
                map_res.put(key_1, map_1.get(key_1));
            }
        }
        System.out.println(output_polynomial(str_1));

        while (iterator_2.hasNext()) {
            Integer key_2 = iterator_2.next();
            str_2.append(map_2.get(key_2)).append("x^").append(key_2).append("+");
            if (map_1.containsKey(key_2)) {
            } else {
                map_res.put(key_2, map_2.get(key_2));
            }
        }
        System.out.println(output_polynomial(str_2));

        TreeSet<Integer> treeSet_res = new TreeSet<>(map_res.keySet());
        Iterator<Integer> iterator_res = treeSet_res.iterator();
        StringBuilder str_res = new StringBuilder();
        while (iterator_res.hasNext()) {
            Integer res_key = iterator_res.next();
            str_res.append(map_res.get(res_key)).append("x^").append(res_key).append("+");
        }
        System.out.println("Результирующий многочлен: " + output_polynomial(str_res));
    }

    private static StringBuilder output_polynomial(StringBuilder str) {
        int a = str.length();
        str.deleteCharAt(a - 1);
        return str;
    }

}
