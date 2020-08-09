package heroes;

/**
 * @author Evgeny Borisov
 */
public interface Hero {


    void kick(Hero enemy);

    boolean isAlive();

    int getPower();

    String getName();

    int getHp();

    void setHp(int newHp);

    void setPower(int newPower);

    void decreaseHp(int delta);

    void decreasePower(int delta);

    void die();

    // int hp  (amount of life, usually if it is zero, it means that this hero is dead)
    // int power  (usually will be used to calculate damage this hero are doing)


}
