package date_and_time;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Evgeny Borisov
 */
public class DateFormatService implements Serializable {

    public static final String DEFAULT_PATTERN = "dd/MMM/yyyy";



    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_PATTERN);


    public DateFormatService() {
    }

    public DateFormatService(String pattern) {
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }


    public void setPatternToDefault() {
        this.setPattern(DEFAULT_PATTERN);
    }

    public void setPattern(String pattern) {
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }

    public  LocalDate convert(String text) {
       return LocalDate.parse(text, this.formatter);
    }

}
