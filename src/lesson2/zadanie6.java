package lesson2;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        while (!scan.hasNextInt()){
            System.out.println("Введите число: ");
            scan.next();
        }
        int n = scan.nextInt();
        if(n<=1){
            System.out.println(n+" - не является прсстым числом");
        } else if(n==2 || n==3 || n==5 || n==7){
            System.out.println(n+" - является простым числом");
        } else if(n%2==0 || n%3==0|| n%5==0|| n%7==0){
            System.out.println(n+" - не является простым числом");
        }else {
            System.out.println(n+" - является простым числом");
        }
    }
}
