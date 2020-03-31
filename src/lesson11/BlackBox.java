/*Реализовать структуру «Черный ящик» хранящую целые числа. Структура должна поддерживать операции
добавления числа и возвращение К-го по минимальности числа и N-ного по максимальности элемента из ящика*/
package lesson11;

import java.util.Iterator;
import java.util.TreeSet;

public class BlackBox<Integer> {
    TreeSet<Integer> treeSet;

    BlackBox(TreeSet<Integer> treeSet) {
        this.treeSet = treeSet;
    }

    public void addNumber(Integer n) {
        this.treeSet.add(n);
    }

    public Integer return_k_min(int k) {
        Iterator<Integer> iterator = this.treeSet.iterator();
        int count = 1;
        if (this.treeSet.size() < k) {
            throw new ArrayIndexOutOfBoundsException("Размер ящика меньше");
        }
        while (iterator.hasNext()) {
            Integer k_min = iterator.next();
            if (count == k) {
                return k_min;
            }
            count++;
        }
        return null;
    }

    public Integer return_n_max(int n) {
        Iterator<Integer> iterator = this.treeSet.iterator();
        int max = this.treeSet.size() + 1 - n;
        int count = 1;
        if (this.treeSet.size() < n) {
            throw new ArrayIndexOutOfBoundsException("Размер ящика меньше");
        }
        while (iterator.hasNext()) {
            Integer n_max = iterator.next();
            if (count == max) {
                return n_max;
            }
            count++;
        }
        return null;
    }
}
class Main{
    public static void main(String[] args) {
        BlackBox<Integer> blackBox=new BlackBox<>(new TreeSet<Integer>());
        blackBox.addNumber(-1);
        blackBox.addNumber(-5);
        blackBox.addNumber(6);
        blackBox.addNumber(10);
        blackBox.addNumber(-2);
        System.out.println(blackBox.return_k_min(5));
        System.out.println(blackBox.return_n_max(2));
    }
}
