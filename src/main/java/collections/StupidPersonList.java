package collections;

import lab0.Person;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Evgeny Borisov
 */
public class StupidPersonList implements List<Person> {
    private StupidPersonCollection personCollection = new StupidPersonCollection();

    @Override
    public int size() {
        return personCollection.size();
    }

    @Override
    public boolean isEmpty() {
        return personCollection.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return personCollection.contains(o);
    }

    @Override
    public Iterator<Person> iterator() {
        return personCollection.iterator();
    }

    @Override
    public Object[] toArray() {
        return personCollection.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return personCollection.toArray(a);
    }

    @Override
    public boolean add(Person person) {
        return personCollection.add(person);
    }

    @Override
    public boolean remove(Object o) {
        return personCollection.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return personCollection.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Person> c) {
        return personCollection.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Person> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return personCollection.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return personCollection.retainAll(c);
    }

    @Override
    public void clear() {
        personCollection.clear();
    }

    @Override
    public Person get(int index) {
        Person[] people = (Person[]) personCollection.toArray();
        return people[index];
    }

    @Override
    public Person set(int index, Person newPerson) {
        Person[] people = (Person[]) personCollection.toArray();
        Person oldPerson = people[index];
        people[index]=newPerson;

        return oldPerson;
    }

    @Override
    public void add(int index, Person element) {

    }

    @Override
    public Person remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Person> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Person> listIterator(int index) {
        return null;
    }

    @Override
    public List<Person> subList(int fromIndex, int toIndex) {
        return null;
    }
}




