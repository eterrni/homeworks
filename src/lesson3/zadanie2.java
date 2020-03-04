package lesson3;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        int kolvo_20 = 0;
        int kolvo_50 = 0;
        int kolvo_100 = 0;
        Atm a1 = new Atm(kolvo_20, kolvo_50, kolvo_100);
        a1.outputCash(130);
    }
}

class Atm {
    int kolvo_20;
    int kolvo_50;
    int kolvo_100;
    int totalCash;

    Atm(int kolvo_20, int kolvo_50, int kolvo_100) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод количества купюр номиналом 20, находящихся в банкомате:");
        do {
            while (!scan.hasNextInt()) {
                System.out.println("Некорректный ввод, повторите попытку:");
                scan.next();
            }
            kolvo_20 = scan.nextInt();
        } while (kolvo_20 < 0);
        System.out.println("Ввод количества купюр номиналом 50, находящихся в банкомате:");
        do {
            while (!scan.hasNextInt()) {
                System.out.println("Некорректный ввод, повторите попытку:");
                scan.next();
            }
            kolvo_50 = scan.nextInt();
        } while (kolvo_50 < 0);
        System.out.println("Ввод количества купюр номиналом 100, находящихся в банкомате:");
        do {
            while (!scan.hasNextInt()) {
                System.out.println("Некорректный ввод, повторите попытку:");
                scan.next();
            }
            kolvo_100 = scan.nextInt();
        } while (kolvo_100 < 0);
        this.kolvo_20 = kolvo_20;
        this.kolvo_50 = kolvo_50;
        this.kolvo_100 = kolvo_100;
        this.totalCash = kolvo_20 * 20 + kolvo_50 * 50 + kolvo_100 * 100;
    }

    public void input_20(int input_20) {
        this.kolvo_20 += input_20;
        this.totalCash += input_20 * 20;
    }


    public void input_50(int input_50) {
        this.kolvo_50 += input_50;
        this.totalCash += input_50 * 50;
    }

    public void input_100(int input_100) {
        this.kolvo_100 += input_100;
        this.totalCash += input_100 * 100;
    }

    public boolean outputCash(int sum) {
        if (sum <= 800 && sum >= 20 && sum != 30 && sum <= this.totalCash && sum % 10 == 0) {
            int[] nominal = {20, 50, 100};
            int[] count = new int[3];
            int index = 0;

            if (sum >= 100) {
                if ((sum % 100 == 10 || sum % 100 == 30 || sum % 100 == 70) && this.kolvo_50 == 0) {
                    System.out.println("В банкомате недостаточно купюр для выдачи");
                    return false;
                } else if (sum % 100 == 10 || sum % 100 == 30) {
                    count[index] = (sum - 50) / nominal[index];
                    count[index + 1]++;
                    if (count[index] >= 5) {
                        count[index + 2] = count[index] / 5;
                        count[index] = count[index] - count[index + 2] * 5;
                    }
                } else if (sum % 100 == 60 || sum % 100 == 80) {
                    count[index + 1]++;
                    sum = sum - 50;
                    count[index] = (sum - 50) / nominal[index];
                    count[index + 1]++;
                    if (count[index] >= 5) {
                        count[index + 2] = count[index] / 5;
                        count[index] = count[index] - count[index + 2] * 5;
                    }
                } else {
                    index = 2;
                    while (index != -1) {
                        count[index] = sum / nominal[index];
                        sum %= nominal[index];
                        index--;
                    }
                }
            } else {
                index = 1;
                while (index != -1) {
                    count[index] = sum / nominal[index];
                    sum %= nominal[index];
                    index--;
                }
            }


            if (count[0] > this.kolvo_20 || count[1] > this.kolvo_50 || count[2] > this.kolvo_100) {
                System.out.println("В банкомате недостаточно купюр для выдачи");
                return false;
            } else {

                for (int i = 0; i < count.length; i++) {
                    System.out.printf("Номинал в %d руб. = %d куп.\n", nominal[i], count[i]);
                }
            }
            return true;
        } else System.out.println("Операция не проведена");
        return false;
    }
}

