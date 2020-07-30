package doviHW.com.hw20200729;

/**
 * @author Dovi Lilling
 */

import java.util.Random;

public class MeleeHero extends Hero {
    Random random = new Random();

    public MeleeHero(int minPower, int maxPower, int minHp, int maxHp, String newName) {
        setPowerAndHp(minPower, maxPower, minHp, maxHp);
        setName(newName);
    }

    public MeleeHero(int minPower, int maxPower, int minHp, int maxHp) {
        setPowerAndHp(minPower, maxPower, minHp, maxHp);
        setName();
    }

    private void setPowerAndHp(int minPower, int maxPower, int minHp, int maxHp){
        int newPower = random.nextInt(maxPower - minPower) + minPower;
        int newHp = random.nextInt(maxHp - minHp) + minHp;
        heroInception(newPower, newHp);
    }

    @Override
    public void kick(Hero enemy) {
        if (isAlive()){
            int damage = -1 * random.nextInt(getPower());
            enemy.modifyHp(damage);
            System.out.println(getName() + " dealt " + damage + " health to " + enemy.getName() + " using melee attack.");
        }
    }
}
