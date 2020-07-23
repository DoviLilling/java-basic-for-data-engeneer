package delegation;

/**
 * @author Evgeny Borisov
 */
public class DefaultArmyDoctor implements ArmyDoctor {
    private Surgeon surgeon = new Surgeon();
    private Dentist dentist = new Dentist();


    @Override
    public void getOutAppendix(String personName) {
        surgeon.getOutAppendix(personName);
    }

    @Override
    public void cleanTeethes(String personName) {
        dentist.cleanTeethes(personName);
    }

    @Override
    public void fight() {
        System.out.println("I'm fighting...");
    }

    @Override
    public void treat(String personName) {
        surgeon.treat(personName);
        dentist.treat(personName);
    }

    @Override
    public Recipient giveRecipient() {

        return surgeon.giveRecipient();
    }
}
