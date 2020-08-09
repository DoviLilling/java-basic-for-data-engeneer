package heroes;

import com.github.javafaker.Faker;

/**
 * @author Evgeny Borisov
 */
public abstract class AbstractHero implements Hero {


    private int hp;
    private int power;
    private String name;

    public AbstractHero(int hp, int power) {
        this.hp = hp;
        this.power = power;
        this.name = RandomUtil.getName();
    }

    @Override
    public boolean isAlive() {
        return this.hp>0;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void decreaseHp(int delta) {
        this.hp-=delta;
    }

    @Override
    public void decreasePower(int delta) {
        this.power-=delta;
    }

    @Override
    public void die() {
        this.hp=0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" "+this.getName();
    }
}
