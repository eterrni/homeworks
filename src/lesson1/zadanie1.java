package lesson1;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String str1 = scan.nextLine();
        System.out.println("Введите второе слово: ");
        String str2 = scan.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Отлично! Слова одинаковы");
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else {
            int dl1 = str1.length();
            int dl2 = str2.length();
            if (dl1 == dl2) {
                System.out.println("Ну, хотя бы они одной длины");
            }
        }
    }
}
