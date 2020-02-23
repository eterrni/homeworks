package lesson1;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chislo;
        do {
            System.out.println("Введите положительное, целое число: ");
            while (!scan.hasNextInt()) {
                System.out.println("Это не число, попробуйте ещё раз: ");
                scan.next();
            }
            chislo = scan.nextInt();
        } while (chislo < 0);
        if (chislo < 100) {
            if (chislo == 1) {
                System.out.println(chislo + " рубль");
            } else if (chislo >= 2 && chislo <= 4) {
                System.out.println(chislo + " рубля");
            } else if ((chislo >= 5 && chislo <= 14) || chislo == 0) {
                System.out.println(chislo + " рублей");
            } else {
                int lastnumber = chislo % 10;
                switch (lastnumber) {
                    case 1:
                        System.out.println(chislo + " рубль");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(chislo + " рубля");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 0:
                        System.out.println(chislo + " рублей");
                        break;
                }
            }
        } else {
            int lastnumber = chislo % 100;
            if (lastnumber == 1) {
                System.out.println(chislo + " рубль");
            } else if (lastnumber >= 2 && lastnumber <= 4) {
                System.out.println(chislo + " рубля");
            } else if ((lastnumber >= 5 && lastnumber <= 14) || lastnumber == 0) {
                System.out.println(chislo + " рублей");
            } else {
                int lastnumber2 = lastnumber % 10;
                switch (lastnumber2) {
                    case 1:
                        System.out.println(chislo + " рубль");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(chislo + " рубля");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 0:
                        System.out.println(chislo + " рублей");
                        break;
                }
            }
        }
    }
}
