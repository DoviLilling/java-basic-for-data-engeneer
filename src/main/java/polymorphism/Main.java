package polymorphism;

import java.util.ArrayList;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        Dragon d = new Dragon();
        d.fly();
        Creature c = d;





        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(new Peasant());
        creatures.add(new Peasant());
        creatures.add(new Elf());
        creatures.add(new Dragon());


        ArrayList<Flyable> flyables = new ArrayList<>();

        flyables.add(new Fly());
        flyables.add(new Dragon());

        for (Creature creature : creatures) {
            creature.go();
        }
    }
}
