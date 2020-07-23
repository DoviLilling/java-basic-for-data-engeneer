package delegation;

/**
 * @author Evgeny Borisov
 */
public interface ArmyDoctor extends Doctor {
    void getOutAppendix(String personName);
    void cleanTeethes(String personName);

    void fight();
}
