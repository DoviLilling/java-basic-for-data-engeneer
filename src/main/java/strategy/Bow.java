package strategy;

/**
 * @author Evgeny Borisov
 */
public class Bow implements Weapon {
    @Override
    public void attack() {
        System.out.println("I'm shooting with a bow");
    }
}
