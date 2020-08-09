package heroes;

/**
 * @author Evgeny Borisov
 */
public class Knife implements Weapon {
    @Override
    public void kick(Hero attacker, Hero defender) {
        System.out.println("vkik vjik");
        int damage = RandomUtil.between(0, 5);
        System.out.println(attacker + " kick with knife for " + damage + " to " + defender);
        defender.decreaseHp(damage);


    }
}
