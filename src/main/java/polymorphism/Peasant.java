package polymorphism;

/**
 * @author Evgeny Borisov
 */
public class Peasant implements Creature {

    public void go() {
        System.out.println("I move");
    }

    @Override
    public void stop() {
        this.holdOn();
    }


    public void holdOn() {
        System.out.println("stopping");
    }

}
