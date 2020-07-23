package delegation;

/**
 * @author Evgeny Borisov
 */
public interface Doctor {
    void treat(String personName);
    Recipient giveRecipient();
}
