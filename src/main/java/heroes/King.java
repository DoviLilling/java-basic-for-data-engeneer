package heroes;

import static heroes.RandomUtil.*;

/**
 * @author Evgeny Borisov
 */
public class King extends AbstractHero {

    private Weapon weapon = new Sword();

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public King() {
        super(between(2,12), between(2,12));
        if (this.getPower() < 7) {
            this.setWeapon(new Knife());
        }else {
            this.setWeapon(new Sword());
        }
    }

    @Override
    public void kick(Hero enemy) {
        weapon.kick(this,enemy);

    }
}
