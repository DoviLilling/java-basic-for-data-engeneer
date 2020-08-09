package heroes;

/**
 * @author Evgeny Borisov
 */
public class Elf extends AbstractHero {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Hero enemy) {
        if (this.getPower() > enemy.getPower()) {
            System.out.println("elf is killing you");
            enemy.setHp(0);
        }else {
            enemy.decreasePower(1);
            System.out.println("elf is making your weaker");
        }
    }

    @Override
    public void die() {
        System.out.println("I'm dying.....");
        super.die();
    }
}
