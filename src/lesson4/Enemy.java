package lesson4;

import java.util.Random;

public abstract class Enemy implements Mortal {
    Random rand = new Random();
    protected int health;
    protected int damage;
    protected String name;
    protected int reg;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
        reg = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        } else return false;
    }

    protected abstract int attackHero(Hero c);


}
