package date_and_time;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class AllClientsService {

    private Map<String, OurClientService> map = Map.of(
            "a", new AClientService(),
            "b", new BClientService()
    );


    public void printDate(String clientName,String date) {
        OurClientService ourClientService = map.get(clientName);
        ourClientService.printMyAge(date);

    }















}
