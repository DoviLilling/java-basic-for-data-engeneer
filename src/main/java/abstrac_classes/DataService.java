package abstrac_classes;

/**
 * @author Evgeny Borisov
 */
public abstract class DataService {
    public void processDataObject(String obj) {
        validate(obj);
        processWithBusinessLogic(obj);
        save(obj);
        sendNotifaction(obj);
    }

    private void sendNotifaction(String obj) {
        System.out.println("mail was sent...");
    }

    private void save(String obj) {
        System.out.println("obj was saved to google cloud");
    }

    protected abstract void processWithBusinessLogic(String obj);

    private void validate(String obj) {
        System.out.println("this obj was validated with 1000 different validators");
    }

}
