package abstrac_classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat());
        cats.add(new SuperCat());
        for (Cat cat : cats) {
            cat.makeVoice();
        }
    }
}
