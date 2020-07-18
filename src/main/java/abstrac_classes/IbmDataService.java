package abstrac_classes;

/**
 * @author Evgeny Borisov
 */
public class IbmDataService extends DataService {
    @Override
    protected void processWithBusinessLogic(String obj) {
        System.out.println("imb logic enriched the proceceed obj");
    }
}
