package delegation;

/**
 * @author Evgeny Borisov
 */
public class Surgeon implements Doctor {
    @Override
    public void treat(String personName) {
        System.out.println("I'm taking the knife and starting the operation on person name: "+personName);
    }

    @Override
    public Recipient giveRecipient() {
        Recipient recipient = new Recipient();
        recipient.setMilligrams(1000);
        recipient.setPillsName("Akamol");
        recipient.setPerDayAmount(3);
        return recipient;
    }

    public void getOutAppendix(String personName) {
        System.out.println("I'm taking my big knife and aaaaaaaaaaaaaa");
    }

    public void killPeople(){
        System.out.println("die!!!!");
    }
}
