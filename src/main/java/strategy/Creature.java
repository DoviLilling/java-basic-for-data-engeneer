package strategy;

/**
 * @author Evgeny Borisov
 */
public interface Creature {
    default void move() {
        System.out.println("I'm moving...");
    }

    void attack();

    void defend();
}
