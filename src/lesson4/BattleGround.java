package lesson4;

import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        int n;

        int e;
        Scanner scan = new Scanner(System.in);
        Hero hero_1 = new Warrior("Axe", 1100);
        Hero hero_2 = new Mage("Invoker", 900);
        Hero hero_3 = new Archer("Windranger", 1070);
        Enemy enemy_1 = new Berserk("Titan", 1000);
        Enemy enemy_2 = new Zombie("Warlock", 670);
        System.out.println("Выберите кем хотите сражаться:\n" + "1-" + hero_1.getName() + " класс героя:Warrior" + "[Health:" + hero_1.getHealth() + "]\n" + "2-" + hero_2.getName() + " класс героя:Mage" + "[Health:" + hero_2.getHealth() + "]\n" + "3-" + hero_3.getName() + " класс героя:Archer" + "[Health:" + hero_3.getHealth() + "]");
        do {
            while (!scan.hasNextInt()) {
                System.out.println("Некорректный ввод, повторите попытку");
                scan.next();
            }
            n = scan.nextInt();
        } while (n < 0 || n > 3);
        System.out.println("Выберите против кого хотите сражаться:\n" + "1-" + enemy_1.getName() + " класс врага:Berserk" + "[Health:" + enemy_1.getHealth() + "]\n" + "2-" + enemy_2.getName() + " класс врага:Zombie"+"[Health:"+enemy_2.getHealth()+"]");
        do {
            while (!scan.hasNextInt()) {
                System.out.println("Некорректный ввод, повторите попытку");
                scan.next();
            }
            e = scan.nextInt();
        } while (e < 0 || e > 3);
        if (n == 1 && e == 1) {
            hero_1.attackEnemy(enemy_1);
        } else if (n == 2 && e == 1) {
            hero_2.attackEnemy(enemy_1);
        } else if (n == 3 && e == 1) {
            hero_3.attackEnemy(enemy_1);
        } else if (n == 1 && e == 2) {
            hero_1.attackEnemy(enemy_2);
        } else if (n == 2 && e == 2) {
            hero_2.attackEnemy(enemy_2);
        } else if (n == 3 && e == 2) {
            hero_3.attackEnemy(enemy_2);
        }
    }
}
