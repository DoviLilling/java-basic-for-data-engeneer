package heroes;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {


    @Override
    public boolean equals(Object obj) {
        return obj instanceof Sword;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public void kick(Hero attacker, Hero defender) {

        int damage = RandomUtil.getRandom().nextInt(attacker.getPower());
        defender.decreaseHp(damage);
        System.out.println(attacker.getClass().getSimpleName() +" "+attacker.getName()+"" +
                " kicks "+defender.getClass()+" "+defender.getName()+ " for "+damage+" hp");
    }
}
