package lesson4;

public class Warrior extends Hero {


    public Warrior(String name, int health) {
        super(name, health);
    }

    private int defence = 3;

    protected void takeDamage(int damage) {
        this.health = this.health - (damage - defence); // у воина есть броня
    }


    @Override
    protected void attackEnemy(Enemy e) {
        do {
            int damage = rand.nextInt(150);
            e.takeDamage(damage);
            System.out.println(this.getName() + "-воин атаковал врага.Нанесённый урон:" + damage + ".Осталось здоровья у " + e.getName() + ":" + e.getHealth());
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
