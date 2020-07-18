package abstrac_classes;

import lab0.Person;

/**
 * @author Evgeny Borisov
 */
public class Dog extends Animal {
    public void auaua(){
        System.out.println("au au");
    }

    @Override
    public void makeVoice() {
        System.out.println("au au");
    }
}
