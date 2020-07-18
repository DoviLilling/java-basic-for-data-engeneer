package reflection_beginning;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class MammalDoctor {

    public void treat(Mammal mammal) {



        if (mammal instanceof Penguin) {
            Penguin p = (Penguin) mammal;
            p.dance();
        }



    }

}
