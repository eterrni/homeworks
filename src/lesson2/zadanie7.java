package lesson2;

import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int factorial=1;
        do {
            System.out.println("Введите число: ");
            while(!scan.hasNextInt()){
                System.out.println("Введите число: ");
                scan.next();
            } n=scan.nextInt();
        } while (n<0);
        if (n==0){
            System.out.println("!"+n+"=0");
        }else{
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("!"+n+" = "+factorial);}
    }
}
