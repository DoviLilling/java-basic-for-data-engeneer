package polymorphism;

/**
 * @author Evgeny Borisov
 */
public class Dragon implements Creature,Flyable {
    @Override
    public void go() {
        System.out.println("prefer to fly");
    }

    @Override
    public void stop() {
        System.out.println("WTF");
    }

    @Override
    public void fly() {
        System.out.println("OOOOOOOOOOOOOOOO");
    }
}
