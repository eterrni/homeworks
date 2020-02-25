package lesson2;

import java.util.Random;

public class zadanie4 {
    public static void main(String[] args) {
        int array[] = new int[3];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(89) + 10;
            System.out.print(array[i] + "; ");
        }
        System.out.println();
        if (array[0] < array[1] && array[1] < array[2]) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else System.out.println("Массив не является строго возрастающей последовательностью");
    }
}

