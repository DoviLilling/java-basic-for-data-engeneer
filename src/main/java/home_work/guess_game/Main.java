package home_work.guess_game;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        guessGame.play(100);
        guessGame.play(10);
        int bestResult = guessGame.getBestResult();
        System.out.println("bestResult = " + bestResult);
    }
}
