package doviHW.com.hw20200715;

public class Score implements Comparable{
    private String gamerName;
    private int score;

    public Score(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setGamerName(String gamerName) {
        this.gamerName = gamerName;
    }

    @Override
    public int compareTo(Object scoreCompare) {
        return score - ((Score) scoreCompare).getScore();
    }

    public void print(){
        System.out.println(gamerName + ": " + score);
    }
}
