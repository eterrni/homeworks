package lesson4;

import java.util.Random;

public abstract class Hero implements Mortal {
    Random rand = new Random();
    private String name;
    protected int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    protected abstract void attackEnemy(Enemy c);

    protected void takeDamage(int damage) {
        this.health -= damage;
    }

    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        } else return false;
    }
}

