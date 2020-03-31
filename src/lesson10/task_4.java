package lesson10;

import java.util.ArrayList;
import java.util.Scanner;

/*4.	Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
•	Задать размер стека.
•	Внести цифру в стек.
•	Извлечь цифру из стека.
Вывести число, у которого цифры идут в обратном порядке.
*/
public class task_4 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.setSize(10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int x = scanner.nextInt();
        while (x > 0) {
            int a=x % 10;
            System.out.print(a);
            stack.push(a);
            x /= 10;
        }
    }
}

class Stack {

    private ArrayList<Integer> list;

    public void setSize(int size) {
        this.list = new ArrayList<>(size);
    }

    public void push(int number) {
        this.list.add(number);
    }

    public int pop() {
        if (this.list.size() > 0) {
            return this.list.remove(this.list.size() - 1);
        } else throw new RuntimeException("Стек пустой");
    }
}
