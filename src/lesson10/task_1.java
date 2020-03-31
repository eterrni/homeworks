package lesson10;

import java.util.*;

/*1.	Задание. Создать список оценок учеников с помощью ListIterator,
 заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.*/
public class task_1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> listIterator = list.listIterator();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            listIterator.add(rand.nextInt(10));
            System.out.print(list.get(i) + " ; ");
        }
        System.out.println();
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer qw = (Integer) listIterator.next();
            if (qw < 4) {
                listIterator.remove();
            }
        }
        for (Integer x : list) {
            System.out.print(x + " ; ");
        }
    }
}
