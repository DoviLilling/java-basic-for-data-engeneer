package doviHW.com.hw20200719;

import lab0.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Evgeny Borisov
 * @author Dovi Lilling
 */
public class StupidPersonCollection implements Collection<Person> {

    private Person[] persons = new Person[0];

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

    private class PersonCollectionIterator implements Iterator<Person> {
        private int iteratorCount = 0;

        @Override
        public boolean hasNext() {
            return iteratorCount < persons.length;
        }

        @Override
        public Person next() {
            if (!hasNext()) throw new NoSuchElementException();
            return persons[iteratorCount++];
        }
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonCollectionIterator();
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

        System.arraycopy(persons, 0, newPersons, 0, persons.length);
        newPersons[persons.length] = person;
        persons = newPersons;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o != null && persons[0].getClass() == o.getClass()){
            Person personToRemove = (Person) o;
            for (int i = 0; i < persons.length; i++) {
                if (persons[i].equals(personToRemove)){
                    Person[] newPersons = new Person[persons.length -1];
                    System.arraycopy(persons, 0, newPersons, 0, i);
                    if (i + 1 < persons.length){
                        System.arraycopy(persons, i + 1, newPersons, i, persons.length - i - 1);
                    }
                    persons = newPersons;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c != null && c.getClass() == getClass()){
            StupidPersonCollection personsToCheck = (StupidPersonCollection) c;
            //for (Person personToCheck : personsToCheck) { - this does not work for some reason, apparently uses the local iterator instead of the parameter's
            for (Iterator<Person> iterator = personsToCheck.iterator(); iterator.hasNext(); ) {
                Person personToCheck = iterator.next();
                if (!contains(personToCheck)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Person> c) {
        int sizeBefore = persons.length;
        for (Person personToAdd : c) {
            add(personToAdd);
        }
        return sizeBefore < persons.length;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        int sizeBefore = persons.length;
        if (c != null && c.getClass() == getClass()) {
            StupidPersonCollection personsToRemove = (StupidPersonCollection) c;
            for (Person personToRemove : personsToRemove) {
                remove(personToRemove);
            }
        }
        return sizeBefore > persons.length;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        int sizeBefore = persons.length;
        if (c != null && c.getClass() == getClass()) {
            StupidPersonCollection personsToRetain = (StupidPersonCollection) c;
            if (personsToRetain.size() == 0) {
                clear();
            } else {
                for (Person person : persons) {
                    if (!personsToRetain.contains(person)) {
                        remove(person);
                    }
                }
            }
        }
        return sizeBefore > persons.length;
    }

    @Override
    public void clear() {
        persons = new Person[0];
    }

    public void print() {
        System.out.println("Collection size: " + size());
        for (Person person : persons) {
            System.out.println("Name: " + person.getName() + ", age: " + person.getAge());
        }
        System.out.println("----------------------------------");
    }
}
