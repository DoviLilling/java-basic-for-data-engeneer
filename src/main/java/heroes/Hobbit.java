package heroes;

/**
 * @author Evgeny Borisov
 */
public class Hobbit extends AbstractHero {
    public Hobbit() {
        super(3, 0);
        this.cry();
    }

    @Override
    public void kick(Hero enemy) {
        this.cry();
    }

    private void cry() {
        System.out.println("auauauauauuauauau");
    }
}
