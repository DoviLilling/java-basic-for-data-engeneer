package reflection_beginning;

/**
 * @author Evgeny Borisov
 */
public class Penguin implements Mammal {
    @Override
    public void breathe() {
        System.out.println("pinguin is breathing");
    }

    public void dance(){
        System.out.println("I'm dancing");
    }
}
