package abstrac_classes;

import polymorphism.Creature;
import polymorphism.Flyable;

/**
 * @author Evgeny Borisov
 */
public class SuperCat extends Cat implements Flyable, Creature {



    @Override
    public void makeVoice() {
        super.makeVoice();
        System.out.println("jjjjjjjjjjjj");

    }

    @Override
    public void go() {
        System.out.println("I'm going...");
    }

    @Override
    public void stop() {
        System.out.println("I'm stopped");
    }

    @Override
    public void fly() {
        System.out.println("FLY FOREVER!!!!!!!!!!");
    }
}
