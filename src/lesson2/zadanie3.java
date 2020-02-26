package lesson2;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.sort;

public class zadanie3 {
    public static void main(String[] args) {
        double[] array=new double[5];
        Random random=new Random();
        System.out.println("Изначальный массив: ");
        for(int i=0;i<array.length;i++){
            array[i]=random.nextDouble()*10;
            System.out.print(array[i]+" ;");
        }
        Arrays.sort(array);
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ;");
        }
        double max=array[0];
        double min=array[0];
        double averageValue=0;
        for (int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
            if(min>array[i]){
                min=array[i];
            }
            averageValue+=array[i];
        }
        averageValue=averageValue/array.length;
        System.out.println();
        System.out.println("Максимальное значение= "+max+"; Минимальное значение= "+min);
        System.out.println("Среднее значение= "+averageValue);
       }
}

