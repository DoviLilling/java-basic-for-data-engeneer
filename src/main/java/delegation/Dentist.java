package delegation;

/**
 * @author Evgeny Borisov
 */
public class Dentist implements Doctor {
    @Override
    public void treat(String personName) {
        System.out.println("open your mouse, lets start... ");
    }

    @Override
    public Recipient giveRecipient() {
        Recipient recipient = new Recipient();
        recipient.setMilligrams(10000);
        recipient.setPillsName("Akamol");
        recipient.setPerDayAmount(1);
        return recipient;
    }

    public void cleanTeethes(String personName){
        System.out.println("open your mouse....");
    }
}
