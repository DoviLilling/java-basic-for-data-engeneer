package doviHW.com.hw20200715;

import javax.swing.*;
import java.util.Random;

public class GuessGame {
    HighScores highScores = new HighScores();

    public void play(int max){
        Random random = new Random();
        int numberToGuess = random.nextInt(max);
        int guesses = 1;
        int currentGuess = Integer.parseInt(JOptionPane.showInputDialog("Guess my number (up to " + max + ")..."));
        while (currentGuess != numberToGuess){
            if (currentGuess < numberToGuess){
                currentGuess = Integer.parseInt(JOptionPane.showInputDialog("Too low, guess again:"));
            } else {
                currentGuess = Integer.parseInt(JOptionPane.showInputDialog("Too high, guess again:"));
            }
            guesses++;
        }
        JOptionPane.showMessageDialog(null, "You win!");
        int score = Math.round((float) max/guesses);
        JOptionPane.showMessageDialog(null, "Your score is: " + score);
        highScores.addHighScore(new Score(score));
    }

    public void printBestScores(){highScores.print();}
}
