package doviHW.com.hw20200715;

import javax.swing.*;

public class Play {
    public static void main(String[] args) {
        String[] gameOptions = {"Play", "Show high scores", "Quit"};
        GuessGame guessGame = new GuessGame();
        int max;
        int option = -1;
        while (option != 2) {
            option = JOptionPane.showOptionDialog(null
                    , "What do you want to do?"
                    , "Main"
                    , JOptionPane.YES_NO_CANCEL_OPTION
                    , JOptionPane.QUESTION_MESSAGE
                    , null
                    , gameOptions
                    , gameOptions[0]);
            switch (option) {
                case 0:
                    max = Integer.parseInt(JOptionPane.showInputDialog("What will be the max number to guess?"));
                    guessGame.play(max);
                    break;
                case 1:
                case 2:
                    guessGame.printBestScores();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Not a valid option, try again.");
            }
        }
    }
}
