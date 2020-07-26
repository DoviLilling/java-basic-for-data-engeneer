package date_and_time;

import enums.MaritalStatus;
import lab0.Person;

import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        LocalDate - date
//        LocalTime - time
//        LocalDateTime - date & hours


        LocalDate date = LocalDate.of(1978, 12, 13);
        LocalDate now = LocalDate.now();
        LocalDateTime now1 = LocalDateTime.now();

        LocalDate yest = now.minusDays(1);
        DayOfWeek dayOfWeek = yest.getDayOfWeek();

        System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.JAPAN));


        long between = ChronoUnit.YEARS.between(date, now);
        System.out.println(between);




    }
}
