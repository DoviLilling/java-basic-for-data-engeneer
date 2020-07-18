package doviHW.com.hw20200715;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighScores {
    List<Score> highScores = new ArrayList<>();

    public void addHighScore(Score newScore){
        boolean needToSort = false;
        if (highScores.size() < 3){
            handleHighScoreAdd(newScore);
            needToSort = true;
        } else if (highScores.get(highScores.size() - 1).getScore() < newScore.getScore()){
            highScores.remove(highScores.size() - 1);
            handleHighScoreAdd(newScore);
            needToSort = true;
        }
        if (needToSort) {
            Collections.sort(highScores);
            Collections.reverse(highScores);
        }
    }

    private void handleHighScoreAdd(Score newScore) {
        newScore.setGamerName(JOptionPane.showInputDialog("You have a high score! What is your name?"));
        highScores.add(newScore);
    }

    public void print(){
        System.out.println("High Scores");
        System.out.println("~~~~~~~~~~~");
        for (Score highScore : highScores) {
            highScore.print();
        }
        System.out.println();
    }
}
