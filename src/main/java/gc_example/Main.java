package gc_example;

import lab0.Person;
import org.apache.commons.lang3.text.StrBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        List<Person> personList = new ArrayList<>();

        int x=1;
        do {
            Person person = new Person();
            person.setName(new StrBuilder("12312312").append(random.nextInt(100000)).append("adsfasdf").append(random.nextInt(1231231)).toString());
            if (random.nextInt(1000) == 1) {
                personList.add(person);

            }
        } while (x==1);

        System.out.println(personList.size());
    }
}
