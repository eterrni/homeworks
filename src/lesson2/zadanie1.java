package lesson2;

import java.util.Random;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + ";");
        }
        System.out.println();
        for ( int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ";");
        }

    }
}
