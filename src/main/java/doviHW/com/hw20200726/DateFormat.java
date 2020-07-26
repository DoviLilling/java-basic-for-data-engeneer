package doviHW.com.hw20200726;

/**
 * @author Dovi Lilling
 */

public enum DateFormat {
    EU_DATE("dd/MM/yyyy"),
    US_DATE("MM/dd/yyyy"),
    ;

    private String format;

    DateFormat(String format){
        this.format = format;
    }

    public String get() {
        return format;
    }
}
