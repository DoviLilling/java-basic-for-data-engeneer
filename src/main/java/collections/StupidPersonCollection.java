package collections;

import lab0.Person;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class StupidPersonCollection implements Collection<Person> {

    private Person[] persons = new Person[3];

    public StupidPersonCollection() {

        StupidPersonIterable people = new StupidPersonIterable();
        Iterator<Person> iterator = people.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            persons[i++] = iterator.next();
        }

    }

    @Override
    public int size() {
        return persons.length;
    }

    @Override
    public boolean isEmpty() {
        return persons.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Person person : persons) {
            if (person.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Person> iterator() {
        return new StupidPersonIterator();  //todo change it with real iterator which returns elements from our persons array
    }

    @Override
    public Object[] toArray() {
        return persons;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) persons;
    }

    @Override
    public boolean add(Person person) {
        Person[] newPersons = new Person[persons.length + 1];

        System.arraycopy(persons, 0, newPersons, 0, 3);
        newPersons[3] = person;
        persons = newPersons;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Person> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        persons = new Person[0];
    }
}
