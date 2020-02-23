package lesson1;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day;
        do {
            System.out.println("Введите число(день):");
            while (!scan.hasNextInt()) {
                System.out.println("Введите число(день):");
                scan.next();
            }
            day = scan.nextInt();
        } while (day > 31 || day < 1);
        int month;
        do {
            System.out.println("Введите месяц:");
            while (!scan.hasNextInt()) {
                System.out.println("Введите месяц");
                scan.next();
            }
            month = scan.nextInt();
        } while (month > 12 || month < 1);
        int god;
        int a = 0;
        do {
            System.out.println("Введите год:");
            while (!scan.hasNextInt()) {
                System.out.println("Введите год:");
                scan.next();
            }
            god = scan.nextInt();
        } while (god <= 0);
        if (god % 4 == 0 && god % 400 == 0) {
            a = 1;
        } else if ((god % 4 == 0 && god % 100 == 0) && god % 400 != 0) {

        } else if (god % 4 == 0 && god % 100 != 0 && god % 400 != 0)
            a = 1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println(day + "." + month + "." + god + "-дата реальная");
            }
            break;
            case 4:
            case 6:
            case 9:
            case 11: {
                if (day <= 30) {
                    System.out.println(day + "." + month + "." + god + "-дата реальная");
                } else {
                    System.out.println(day + "." + month + "." + god + "-дата не реальная");
                }
            }
            break;
            case 2: {
                if (a == 1 && day <= 29) {
                    System.out.println(day + "." + month + "." + god + "-дата реальная");
                } else if (a == 1 && day > 29) {
                    System.out.println(day + "." + month + "." + god + "-дата не реальная");
                } else if (a == 0 && day <= 28) {
                    System.out.println(day + "." + month + "." + god + "-дата реальная");
                } else if (a == 0 && day > 28) {
                    System.out.println(day + "." + month + "." + god + "-дата не реальная");
                }
            }
            break;
        }
    }
}
