package date_and_time;

import java.time.LocalDate;

/**
 * @author Evgeny Borisov
 */
public class BClientService implements OurClientService {


    private DateFormatService formatService = new DateFormatService("dd/MMM/yy");

    // this client work with Pattern dd/MMM/yy
    @Override
    public void printMyAge(String date) {
        printAge(formatService.convert(date));
    }
}
