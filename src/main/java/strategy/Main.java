package strategy;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf();
        for (int i = 0; i < 15; i++) {
            elf.attack();
        }
    }
}
