package lesson10;

import java.util.HashSet;
import java.util.Set;

/*5.	Определить множество на основе множества целых чисел.
 Создать методы для определения пересечения и объединения множеств.*/
public class task_5 {
    public static void main(String[] args) {
        Set<Integer> set_1 = new HashSet<>();
        set_1.add(2);
        Set<Integer> set_2 = new HashSet<>();
        set_2.add(2);
        set_2.add(5);
        Set<Integer> set_3 = joinSet(set_1, set_2);
        for (Integer x : set_3) {
            System.out.println(x);
        }
        Set<Integer> set_4 = crossSet(set_1, set_2);
        for (Integer x : set_4) {
            System.out.println(x);
        }
    }

    public static Set<Integer> joinSet(Set<Integer> s1, Set<Integer> s2) {
        s1.addAll(s2);
        return s1;
    }

    public static Set<Integer> crossSet(Set<Integer> s1, Set<Integer> s2) {
        s1.retainAll(s2);
        return s1;
    }
}
