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
        for (int z = array.length - 1; z >= 0; z--) {
            System.out.print(array[z] + ";");
        }

    }
}
