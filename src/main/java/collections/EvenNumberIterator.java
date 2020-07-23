package collections;

import lab0.Person;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class EvenNumberIterator implements Iterator<Long> {

    Person person = new Person();

    {
        person.setAge(12);
    }

    public EvenNumberIterator() {
        System.out.println(123);
    }

    public EvenNumberIterator(long counter) {
        System.out.println(counter);
    }

    private long counter = 0;

    @Override
    public boolean hasNext() {

        return counter <= Long.MAX_VALUE-10;
    }

    @Override
    public Long next() {


        return counter += 2;
    }

    public static void main(String[] args) {
        System.out.println(12);
    }
}
