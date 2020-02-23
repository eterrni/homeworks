package lesson1;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int god;
        do {
            System.out.println("Введите год:");
            while (!scan.hasNextInt()) {
                System.out.println("Введите пожалуйста число(год):");
                scan.next();
            }
            god = scan.nextInt();
        } while (god <= 0);
        if (god%4==0 && god%400==0){
            System.out.println(god+" високосный");
        }else if((god%4==0 && god%100==0) && god%400!=0){
            System.out.println(god+" не високосный");
        }else if (god%4==0 && god%100!=0 && god%400!=0)
            System.out.println(god+" високсоный");
    }
}
