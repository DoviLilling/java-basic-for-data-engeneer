package heroes;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class Knight extends AbstractHero {

    private Set<Weapon> weapons;



    public Knight() {
        super(RandomUtil.between(10,20), RandomUtil.between(10,20));
        List<Weapon> weapons = asList(new Sword(), new Knife());
        this.weapons = new HashSet<>(weapons);
    }

    @Override
    public void kick(Hero enemy) {

        weapons.add(new Sword());
        weapons.add(new Sword());
        weapons.add(new Sword());
        weapons.add(new Sword());
        for (Weapon weapon : weapons) {
            weapon.kick(this,enemy);
        }
    }
}
