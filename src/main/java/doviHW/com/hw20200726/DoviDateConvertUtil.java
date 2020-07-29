package doviHW.com.hw20200726;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Dovi Lilling
 */
public class DoviDateConvertUtil {

    public static LocalDate convert(String text, DateFormat format) {
        DateTimeFormatter formatter = createFormatter(format.get());
        return LocalDate.parse(text, formatter);
    }

    public static String convert(LocalDate date, DateFormat format) {
        DateTimeFormatter formatter = createFormatter(format.get());
        return formatter.format(date);
    }

    public static LocalDateTime convert(String text, DateTimeFormat format) {
        DateTimeFormatter formatter = createFormatter(format.get());
        return LocalDateTime.parse(text, formatter);
    }

    public static String convert(LocalDateTime date, DateTimeFormat format) {
        DateTimeFormatter formatter = createFormatter(format.get());
        return formatter.format(date);
    }

    private static DateTimeFormatter createFormatter(String format){
        return DateTimeFormatter.ofPattern(format);
    }
}
