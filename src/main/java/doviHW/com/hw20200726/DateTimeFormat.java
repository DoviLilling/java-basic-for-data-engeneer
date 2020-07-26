package doviHW.com.hw20200726;

/**
 * @author Dovi Lilling
 */

public enum DateTimeFormat {
    EU_DATETIME("dd/MM/yyyy HH:mm:ss"),
    US_DATETIME("MM/dd/yyyy hh:mm:ss a"),
    ;

    private String format;

    DateTimeFormat(String format){
        this.format = format;
    }

    public String get() {
        return format;
    }
}
