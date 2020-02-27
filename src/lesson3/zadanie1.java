package lesson3;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Выберите формат ввода данных:");
        System.out.println("1 - Ввод только секунд");
        System.out.println("2 - Ввод в формате секунды,минуты,часы");
        do {
            while (!scan.hasNextInt()) {
                System.out.println("Некорректный ввод, повторите попытку");
                scan.next();
            }
            n = scan.nextInt();
        } while (n <=0 || n>=3);
        if (n == 1) {
            int seconds;
            do {
                System.out.println("Введите секунды");
                while (!scan.hasNextInt()) {
                    System.out.println("Некорректный ввод, повторите попытку");
                    scan.next();
                }
                seconds = scan.nextInt();
            } while (seconds < 0);
            Time formatSeconds = new Time(seconds);
        }
        if (n == 2) {
            int sec;
            int min;
            int hours;
            do {
                System.out.println("Введите секунды");
                while (!scan.hasNextInt()) {
                    System.out.println("Некорректный ввод, повторите попытку");
                    scan.next();
                }
                sec = scan.nextInt();
            } while (sec < 0);
            do {
                System.out.println("Введите минуты");
                while (!scan.hasNextInt()) {
                    System.out.println("Некорректный ввод, повторите попытку");
                    scan.next();
                }
                min = scan.nextInt();
            } while (min < 0);
            do {
                System.out.println("Введите часы");
                while (!scan.hasNextInt()) {
                    System.out.println("Некорректный ввод, повторите попытку");
                    scan.next();
                }
                hours = scan.nextInt();
            } while (hours < 0);
            Time formatFull = new Time(sec, min, hours);
        }
    }


    static class Time {
        Time(int seconds) {
            dataOutput(seconds);
        }

        Time(int sec, int min, int hours) {
            int seconds = transferToSeconds(sec, min, hours);
            dataOutput(seconds);
        }

        static int transferToSeconds(int sec, int min, int hours) {
            return sec + min * 60 + hours * 3600;
        }

        static void dataOutput(int seconds) {
            int hours = seconds / 3600;
            int min = (seconds - hours * 3600) / 60;
            int sec = (seconds - hours * 3600 - min * 60);
            System.out.println(hours + ":" + min + ":" + sec);
        }
    }
}

