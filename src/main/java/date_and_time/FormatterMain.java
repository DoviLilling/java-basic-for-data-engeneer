package date_and_time;

import java.time.LocalDate;

/**
 * @author Evgeny Borisov
 */
public class FormatterMain {
    public static void main(String[] args) {

        AllClientsService service = new AllClientsService();
        service.printDate("a","12/01/1298");
        service.printDate("b","12/Oct/04");
    }
}
