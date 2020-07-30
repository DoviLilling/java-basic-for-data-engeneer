package date_and_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Evgeny Borisov
 */
public interface OurClientService {
    int MAX_PRICE = 100_000_00;

    void printMyAge(String date);


    default void printAge(LocalDate localDate) {
        int age = (int) ChronoUnit.YEARS.between(localDate, LocalDate.now());
        System.out.println(age);
    }
}
