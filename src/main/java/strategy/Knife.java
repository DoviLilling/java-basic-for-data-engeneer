package strategy;

/**
 * @author Evgeny Borisov
 */
public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("Kick with a knife");
    }
}
