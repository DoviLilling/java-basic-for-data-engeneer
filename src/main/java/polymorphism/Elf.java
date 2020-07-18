package polymorphism;

/**
 * @author Evgeny Borisov
 */
public class Elf implements Creature{
    @Override
    public void go() {
        System.out.println("at your service");
    }

    @Override
    public void stop() {
        System.out.println("Shhh");
    }
}
