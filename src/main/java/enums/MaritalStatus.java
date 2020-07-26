package enums;

/**
 * @author Evgeny Borisov
 */
public enum MaritalStatus {

    SINGLE("רווק","холостой"),
    MARRIED("nasui","jenat"),
    DIVORCED("garush","разведён"),

    ;
    private String hebrewDescription;
    private String russ;

    MaritalStatus(String hebrewDescription, String russ) {
        this.hebrewDescription = hebrewDescription;
        this.russ = russ;
    }

    public String getHebrewDescription() {
        return hebrewDescription;
    }

    public String getRuss() {
        return russ;
    }

    @Override
    public String toString() {
        return "MaritalStatus{" +
                "hebrewDescription='" + hebrewDescription + '\'' +
                ", russ='" + russ + '\'' +
                '}';
    }
}
