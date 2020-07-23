package strategy;

/**
 * @author Evgeny Borisov
 */
public class Elf  implements Creature {

    private Weapon weapon = new Bow();
    private int numberOfArrows = 10;

    @Override
    public void attack() {
        if (numberOfArrows > 0) {
            weapon = new Bow();
        }
        if (numberOfArrows == 0) {
            weapon = new Knife();
        }
        weapon.attack();
        numberOfArrows--;

    }

    @Override
    public void defend() {
        System.out.println("elf is protecting himself with elfs hands");
    }
}
