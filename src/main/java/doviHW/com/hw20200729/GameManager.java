package doviHW.com.hw20200729;

/**
 * @author Dovi Lilling
 */

public class GameManager {
    public static void fight(Hero hero1, Hero hero2){
        int round = 1;
        boolean areHobbits = (hero1 instanceof Hobbit && hero2 instanceof Hobbit);
        String winner;
        String loser;
        System.out.println(hero1.getName() + " and " + hero2.getName() + " have come to a bridge from both sides. They are now fighting about who will move aside.");
        while ((hero1.isAlive() && hero2.isAlive() && !areHobbits) || (areHobbits && round < 4)){
            System.out.println("Round " + round + ":");
            System.out.println("~~~~~~~~");
            hero1.print();
            hero2.print();
            hero1.kick(hero2);
            hero2.kick(hero1);
            round++;
        }
        System.out.println();
        if (areHobbits){
            System.out.println(hero1.getName() + " and " + hero2.getName() + " both died of dehydration after crying for 40 days and 40 nights. A feast for the crows.");
        } else {
            winner = hero1.isAlive() ? hero1.getName() : hero2.getName();
            loser = hero1.isAlive() ? hero2.getName() : hero1.getName();
            if (round > 2){
                System.out.println("After a glorious battle, " + loser + " is dead, but he will not be forgotten.");
            } else {
                System.out.println(loser + " is lying on the bridge, staring blankly at the sky. The story of this bloodbath will be told for generations.");
            }
            System.out.println(winner + " is now crossing the bridge smugly, oblivious to the perils lying ahead.");
        }
        System.out.println();
        System.out.println("~~ GAME OVER ~~");
    }
}
