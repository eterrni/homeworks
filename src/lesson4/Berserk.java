package lesson4;

public class Berserk extends Enemy {
private int count;
    public Berserk(String name, int health) {
        super(name, health);
    }

    @Override
    protected int attackHero(Hero h) {
        if (this.health <= 400 && count==0) {  // у берсерка, если мало здоровья, он начинает бить сильнее
            System.out.println("У "+this.name+" мало здоровья, самое время начать бить сильнее!!");
            count++;
            int damage = rand.nextInt(250);
            return damage;
        } else damage = rand.nextInt(150);
        return damage;
    }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
    }
}
