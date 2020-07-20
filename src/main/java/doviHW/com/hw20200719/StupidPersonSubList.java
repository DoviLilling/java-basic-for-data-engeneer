package doviHW.com.hw20200719;

import lab0.Person;

import java.util.Collection;
import java.util.Iterator;

public class StupidPersonSubList extends StupidPersonList{
    private StupidPersonList parent;
    private int startIndex;
    private int endIndex;

    public StupidPersonSubList(StupidPersonList pParent, int pStartIndex, int pEndIndex){
        parent = pParent;
        startIndex = pStartIndex;
        endIndex = pEndIndex;
    }

    @Override
    public int size() {
        return endIndex - startIndex;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = startIndex; i < endIndex; i++){
            if (parent.get(i).equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Person> c) {
        return parent.addAll(index + startIndex, c);
    }

    @Override
    public Person set(int index, Person element) {
        return parent.set(index + startIndex, element);
    }

    @Override
    public void print() {
        System.out.println("Collection size: " + size());
        for (int i = startIndex; i < endIndex; i++){
            System.out.println("Name: " + parent.get(i).getName() + ", age: " + parent.get(i).getAge());
        }
        System.out.println("----------------------------------");
    }

    // etc...
}
