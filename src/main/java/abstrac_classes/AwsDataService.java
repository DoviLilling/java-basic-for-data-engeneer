package abstrac_classes;

/**
 * @author Evgeny Borisov
 */
public class AwsDataService extends DataService {
    @Override
    protected void processWithBusinessLogic(String obj) {
        System.out.println("aws business was invoked on obj");
    }
}
