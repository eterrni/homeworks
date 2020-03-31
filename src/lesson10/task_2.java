package lesson10;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/*2 Задание. Создать список оценок учеников с помощью ListIterator,
заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.*/
public class task_2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> listIterator = list.listIterator();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            listIterator.add(rand.nextInt(1000));
            System.out.print(list.get(i) + " ; ");
        }
        System.out.println();
        listIterator = list.listIterator();
        int max = 0;
        while (listIterator.hasNext()) {
            Integer qw = (Integer) listIterator.next();
            if (qw >= max) {
                max = qw;
            }
    }
        System.out.println(max);
    }
}
