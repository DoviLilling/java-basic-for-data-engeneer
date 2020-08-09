package heroes;

/**
 * @author Evgeny Borisov
 */
public interface Mother {
    int HEIGHT = 170;

    default void talkToChildren() {
        System.out.println("COME TO ME!!!!!!!!!");
    }
}
