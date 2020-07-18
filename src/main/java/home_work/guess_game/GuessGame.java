package home_work.guess_game;

import javax.swing.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class GuessGame {

    private int bestResult = Integer.MAX_VALUE;

    public void play(int max) {
        Random random = new Random();
        int x = random.nextInt(max);

        int numberOfTries = 0;


        int answer = Integer.parseInt(JOptionPane.showInputDialog("What is your number?"));

        if (answer == x) {
            JOptionPane.showMessageDialog(null, "You win!!!");
        }
        if (answer < x) {
            answer = Integer.parseInt(JOptionPane.showInputDialog("too low, try again"));
        }
        if (answer > x) {
            answer = Integer.parseInt(JOptionPane.showInputDialog("too big, try again"));
        }

    }


    public int getBestResult() {
        return bestResult;
    }
}
