package collections;

import lab0.Person;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class StupidPersonIterable implements Iterable<Person> {
    @Override
    public Iterator<Person> iterator() {
        return new StupidPersonIterator();
    }
}
