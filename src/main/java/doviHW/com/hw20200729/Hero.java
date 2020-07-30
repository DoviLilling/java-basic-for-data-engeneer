package doviHW.com.hw20200729;

/**
 * @author Dovi Lilling
 */

import com.github.javafaker.Faker;

public abstract class Hero {
    private String name;
    private int hp;
    private int power;

    public abstract void kick(Hero enemy);

    public boolean isAlive(){ return hp > 0 && power > 0;}

    protected void heroInception(int startingPower, int startingHp){
        power = startingPower;
        hp = startingHp;
    }

    public void modifyHp(int change){hp += change;}

    public void modifyPower(int change){power += change;}

    public void setName(String newName) {
        name = newName;
    }

    public void setName() {
        Faker faker = new Faker();
        name = faker.funnyName().name();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public void print(){
        System.out.println(getName() + " hp: " + getHp() + ", power: " + getPower());
    }
}
