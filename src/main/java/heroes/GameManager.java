package heroes;

/**
 * @author Evgeny Borisov
 */
public class GameManager {

    public void makeFight(Hero h1, Hero h2) {
        while (h1.isAlive() && h2.isAlive()) {
            h1.kick(h2);
            h2.kick(h1);
        }
        if (h1.isAlive()) {
            System.out.println(h1+ " is winner");
        }
        if (h2.isAlive()) {
            System.out.println(h2+" is winner");
        }
        if (!h1.isAlive() && !h2.isAlive()) {
            System.out.println("draw");
        }
    }
}
