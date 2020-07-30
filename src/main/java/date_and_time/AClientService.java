package date_and_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Evgeny Borisov
 */
public class AClientService implements OurClientService {


    private DateFormatService formatService = new DateFormatService("dd/MM/yyyy");

    // this client work with Pattern dd/MM/yyyy
    @Override
    public void printMyAge(String date) {
        LocalDate localDate = formatService.convert(date);
        printAge(localDate);
    }



}
