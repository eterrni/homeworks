package lesson2;
import java.util.Random;
import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
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
        int array1[][] = new int[i][j];
        do {
            System.out.println("Введите кол-во строк второго массива :");
            while (!scan.hasNextInt()) {
                System.out.println("Введите кол-во строк второго массива :");
                scan.next();
            }
            i = scan.nextInt();
        } while (i <= 0);
        do {
            System.out.println("Введите кол-во столбцов второго массива :");
            while (!scan.hasNextInt()) {
                System.out.println("Введите кол-во столбцов второго массива :");
                scan.next();
            }
            j = scan.nextInt();
        } while (j <= 0);
        int array2[][] = new int[i][j];
        Random random = new Random();
        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array1[i].length; j++) {
                array1[i][j] = random.nextInt(10);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < array2.length; i++) {
            for (j = 0; j < array2[i].length; j++) {
                array2[i][j] = random.nextInt(10);
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите координаты сравниваемых элементов (строка столбец): ");
         i = scan.nextInt();
         j = scan.nextInt();
        equals(array1,array2,i,j);
    }

    private static void equals(int array1[][],int array2[][],int i, int j) {
        if (array1[i][j] == array2[i][j]) {
            System.out.println("Элементы равны");
        } else {
            System.out.println("Элементы не равны");
        }
    }
}

