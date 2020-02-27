package lesson3;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sec = scan.nextInt();
        int min = scan.nextInt();
        int hours = scan.nextInt();
        Time TimeInterval_1 = new Time(sec, min, hours);
        Time TimeInterval_2 = new Time(Time.transferToSeconds(sec, min, hours));
        Time.dataOutput(sec, min, hours);
    }


    static class Time {
        Time(int seconds) {
        }

        Time(int sec, int min, int hours) {
        }

        static int transferToSeconds(int sec, int min, int hours) {
            return sec + min * 60 + hours * 3600;
        }

        static void dataOutput(int sec, int min, int hours) {
            System.out.println(sec + ":" + min + ":" + hours);
        }
    }
}

