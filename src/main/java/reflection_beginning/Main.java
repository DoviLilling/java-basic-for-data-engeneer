package reflection_beginning;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        MammalDoctor mammalDoctor = new MammalDoctor();
        Horse h1 = new Horse();
        mammalDoctor.treat(h1);
        mammalDoctor.treat(new Penguin());
    }
}
