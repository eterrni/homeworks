package lesson4;

public class Zombie extends Enemy {
    private int count;

    public Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    protected int attackHero(Hero h) {
        int damage = rand.nextInt(100);
        return damage;
    }


    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
        regeniration();
    }

    protected int regeniration() { // у зомби есть шанс возраждения
        if (this.health <= 0 && count!=1) {
            count++;
            int a = rand.nextInt(2);
            if (a == 1) {
                System.out.println("Зомби-" + this.getName() + " возрождается");
                this.health = reg;
                return this.health;
            } else System.out.println("У Зомби-" + this.getName() + " не получилось возродиться");
            return this.health;
        } else return this.health;
    }
}
