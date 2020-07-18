package polymorphism;

/**
 * @author Evgeny Borisov
 */
public class Fly implements Flyable {
    @Override
    public void fly() {
        System.out.println("fly is prefect");
    }
}
