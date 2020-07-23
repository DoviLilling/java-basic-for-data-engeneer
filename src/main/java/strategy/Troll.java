package strategy;

/**
 * @author Evgeny Borisov
 */
public class Troll implements Creature {
    @Override
    public void attack() {
        System.out.println("kick with Log");
    }

    @Override
    public void defend() {
        System.out.println("I don't care I have a lot of hit points");
    }
}
