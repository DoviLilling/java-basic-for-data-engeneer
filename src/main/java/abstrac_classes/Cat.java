package abstrac_classes;

/**
 * @author Evgeny Borisov
 */
public class Cat extends Animal {
    public void mau(){
        System.out.println("may");
    }

    @Override
    public void makeVoice() {
        System.out.println("fr frrr");
    }
}
