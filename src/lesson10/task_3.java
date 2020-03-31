package lesson10;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*3.	Вывести учеников из списка в обратном порядке. (2 варианта решения).*/
public class task_3 {
    public static void main(String[] args) {
        List<Students> list = new LinkedList<>();
        list.add(new Students("Анна"));
        list.add(new Students("Боря"));
        list.add(new Students("Вика"));
        list.add(new Students("Дима"));
        list.add(new Students("Яна"));
        ListIterator<Students> listIterator = list.listIterator();
        // 1-ый вариант решения
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i).getName());
        }
        // 2-ой вариант решения
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous().getName());
        }

    }
}

class Students {
    String name;

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
