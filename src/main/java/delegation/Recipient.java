package delegation;

/**
 * @author Evgeny Borisov
 */
public class Recipient {

    private String pillsName;
    private int perDayAmount;
    private int milligrams;


    public String getPillsName() {
        return pillsName;
    }

    public void setPillsName(String pillsName) {
        this.pillsName = pillsName;
    }

    public int getPerDayAmount() {
        return perDayAmount;
    }

    public void setPerDayAmount(int perDayAmount) {
        this.perDayAmount = perDayAmount;
    }

    public int getMilligrams() {
        return milligrams;
    }

    public void setMilligrams(int milligrams) {
        this.milligrams = milligrams;
    }
}
