package doviHW.com.hw20200719;

import lab0.Person;

import java.util.*;

public class StupidPersonList extends StupidPersonCollection implements List<Person> {

    private StupidPersonCollection createCollectionFromList(Collection<?> c){
        StupidPersonCollection newPersons = new StupidPersonCollection();
        for (Person person : (StupidPersonList) c) {
            newPersons.add(person);
        }
        return newPersons;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c == null || c.getClass() != getClass()) { return false; }
        return super.containsAll(createCollectionFromList(c));
    }

    @Override
    public boolean addAll(int index, Collection<? extends Person> c) {
        if (c == null) { return false; }
        int sizeBefore = size();
        boolean returnVal = false;
        int i = 0;
        StupidPersonCollection newPersons = new StupidPersonCollection();
        for (Iterator<Person> iterator = super.iterator(); iterator.hasNext(); ){
            Person person = iterator.next();
            if (i==index) {newPersons.addAll(c);}
            newPersons.add(person);
            i++;
        }
        clear();
        addAll(newPersons);
        return sizeBefore < size();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (c.getClass() == getClass()) {
            return super.removeAll(createCollectionFromList(c));
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if (c.getClass() == getClass()) {
            return super.retainAll(createCollectionFromList(c));
        }
        return false;
    }

    @Override
    public Person get(int index) {
        int i = 0;
        Iterator<Person> iterator = super.iterator();
        for (; i < index; i++){
            iterator.next();
        }
        return iterator.next();
    }

    @Override
    public Person set(int index, Person element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Person returnVal = new Person();
        StupidPersonList newPersons = new StupidPersonList();
        int i = 0;
        for (Iterator<Person> iterator = super.iterator(); iterator.hasNext(); ) {
            if (i == index){
                newPersons.add(element);
                returnVal = iterator.next();
            } else {
                newPersons.add(iterator.next());
            }
            i++;
        }
        clear();
        addAll(newPersons);
        return returnVal;
    }

    @Override
    public void add(int index, Person element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        } else if (index == size()) {
            add(element);
            return;
        }
        StupidPersonList newPersons = new StupidPersonList();
        int i = 0;
        for (Iterator<Person> iterator = super.iterator(); iterator.hasNext(); ) {
            if (i == index){
                newPersons.add(element);
            }
            newPersons.add(iterator.next());
            i++;
        }
        clear();
        addAll(newPersons);
    }

    @Override
    public Person remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Person returnVal = new Person();
        StupidPersonList newPersons = new StupidPersonList();
        int i = 0;
        for (Iterator<Person> iterator = super.iterator(); iterator.hasNext(); ) {
            if (i == index){
                returnVal = iterator.next();
            } else {
                newPersons.add(iterator.next());
            }
            i++;
        }
        clear();
        addAll(newPersons);
        return returnVal;
    }

    @Override
    public int indexOf(Object o) {
        int i = 0;
        for (Iterator<Person> iterator = super.iterator(); iterator.hasNext(); ) {
            if (iterator.next().equals(o)) return i;
            i++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int returnVal = -1;
        int i = 0;
        for (Iterator<Person> iterator = super.iterator(); iterator.hasNext(); ) {
            if (iterator.next().equals(o)) returnVal = i;
            i++;
        }
        return returnVal;
    }

    protected class PersonListIterator extends PersonCollectionIterator implements ListIterator<Person>{
        boolean canCallAddOrRemove = false;

        public PersonListIterator(){}

        public PersonListIterator(int index){
            iteratorCount = index;
        }

        @Override
        public Person next() {
            if(!hasNext()) throw new NoSuchElementException();
            canCallAddOrRemove = true;
            return get(iteratorCount++);
        }

        @Override
        public boolean hasPrevious() {
            return iteratorCount > 1;
        }

        @Override
        public Person previous() {
            if (!hasPrevious()) throw new NoSuchElementException();
            canCallAddOrRemove = true;
            return get(--iteratorCount-1);
        }

        @Override
        public int nextIndex() {
            if(!hasNext()) return size();
            return iteratorCount;
        }

        @Override
        public int previousIndex() {
            if(!hasPrevious()) return -1;
            return iteratorCount - 2;
        }

        @Override
        public void remove() {
            if (!canCallAddOrRemove) throw new IllegalStateException();
            canCallAddOrRemove = false;
            StupidPersonList.this.remove(iteratorCount - 1);
        }

        @Override
        public void set(Person person) {
            if (!canCallAddOrRemove) throw new IllegalStateException();
            StupidPersonList.this.set(iteratorCount - 1, person);
        }

        @Override
        public void add(Person person) {
            if (!canCallAddOrRemove) throw new IllegalStateException();
            StupidPersonList.this.add(iteratorCount - 1, person);
        }
    }

    @Override
    public ListIterator<Person> listIterator() {
        return new PersonListIterator();
    }

    @Override
    public ListIterator<Person> listIterator(int index) {
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException();
        return new PersonListIterator(index);
    }

    @Override
    public StupidPersonList subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex) throw new IndexOutOfBoundsException();
        return new StupidPersonSubList(this, fromIndex, toIndex);
    }
}
