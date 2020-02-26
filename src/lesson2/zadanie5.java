package lesson2;

import java.util.Random;
import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, i1;
        int j, j1;
        do {
            System.out.println("Введите кол-во строк первого массива :");
            while (!scan.hasNextInt()) {
                System.out.println("Введите кол-во строк первого массива :");
                scan.next();
            }
            i = scan.nextInt();
        } while (i <= 0);
        do {
            System.out.println("Введите кол-во столбцов первого массива :");
            while (!scan.hasNextInt()) {
                System.out.println("Введите кол-во столбцов первого массива :");
                scan.next();
            }
            j = scan.nextInt();
        } while (j <= 0);
        do {
            System.out.println("Введите кол-во строк второго массива :");
            while (!scan.hasNextInt()) {
                System.out.println("Введите кол-во строк второго массива :");
                scan.next();
            }
            i1 = scan.nextInt();
        } while (i1 <= 0);
        do {
            System.out.println("Введите кол-во столбцов второго массива :");
            while (!scan.hasNextInt()) {
                System.out.println("Введите кол-во столбцов второго массива :");
                scan.next();
            }
            j1 = scan.nextInt();
        } while (j1 <= 0);
        int array[][] = new int[i][j];
        int array1[][] = new int[i1][j1];
        Random random = new Random();
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (i1 = 0; i1 < array1.length; i1++) {
            for (j1 = 0; j1 < array1[i1].length; j1++) {
                array1[i1][j1] = random.nextInt(10);
                System.out.print(array1[i1][j1] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите координаты первого элемента (строка столбец): ");
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println("Введите координаты второго элемента (строка столбец): ");
        int k = scan.nextInt();
        int l = scan.nextInt();
        equals(array[n][m], array1[k][l]);
    }

    private static void equals(int i, int i1) {
        if (i == i1) {
            System.out.println("Элементы равны");
        } else {
            System.out.println("Элементы не равны");
        }
    }
}

