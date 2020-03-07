package lesson4;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    private int count = 0;


    @Override
    protected void attackEnemy(Enemy e) {
        do {
            int damage = 0;
            count++;
            if (count % 3 == 0) { // у лучника каждая 3-я атака с шансом на повышенный урон
                damage = rand.nextInt(300);
            } else {
                damage = rand.nextInt(180);
            }
            e.takeDamage(damage);
            System.out.println(this.getName() + "-лучник атаковал врага.Нанесённый урон:" + damage + ".Осталось здоровья у " + e.getName() + ":" + e.getHealth());
            this.takeDamage(e.attackHero(this));
            if (!e.isAlive()) {
                System.out.println("Победил герой : " + this.getName());
                break;
            }
            System.out.println(e.getName() + "-враг атаковал " + this.getName() + ".Нанесённый урон:" + e.attackHero(this) + ".Осталось здоровья у " + this.getName() + ":" + this.getHealth());
            if (!this.isAlive()) {
                System.out.println("Победил враг : " + e.getName());
                break;
            }
        } while (e.getHealth() >= 0 && this.getHealth() >= 0);
    }
}
