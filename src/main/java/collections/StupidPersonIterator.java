package collections;

import com.github.javafaker.Faker;
import com.github.javafaker.FunnyName;
import lab0.Person;

import java.util.Iterator;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class StupidPersonIterator implements Iterator<Person> {

    private int counter;

    @Override
    public boolean hasNext() {
        return counter<3;
    }

    @Override
    public Person next() {

        Random random = new Random();
        Faker faker = new Faker();


        counter++;
        Person person = new Person();
        person.setAge(random.nextInt(120));
        person.setName(faker.funnyName().name());
        return person;
    }
}






