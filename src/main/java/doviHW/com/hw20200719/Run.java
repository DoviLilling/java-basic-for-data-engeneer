package doviHW.com.hw20200719;

import collections.StupidPersonIterable;
import lab0.Person;

import java.util.Iterator;

public class Run {
    public static void main(String[] args) {
        StupidPersonIterable people = new StupidPersonIterable();
        Iterator<Person> iterator = people.iterator();
        StupidPersonCollection persons = new StupidPersonCollection();
        while (iterator.hasNext()) {
            persons.add(iterator.next());
        }

        persons.print(); // size should be 3

        Person person1 = new Person();
        person1.setName("Dovi1");
        person1.setAge(40);
        persons.add(person1);
        persons.print(); // size should be 4
        persons.add(person1);
        persons.print(); // size should be 5
        persons.remove(person1);
        persons.print(); // size should be 4
        persons.remove(person1);
        persons.print(); // size should be 3
        persons.remove(person1);
        persons.print(); // size should still be 3

        persons.add(person1);
        System.out.println("Contains person1? " + persons.contains(person1)); // should be true

        Person person2 = new Person();
        person2.setName("Dovi2");
        person2.setAge(39);
        System.out.println("Contains person2? " + persons.contains(person2)); // should be false


        StupidPersonCollection newPersons = new StupidPersonCollection();
        newPersons.add(person1);

        System.out.println("Contains all (person1)? " + persons.containsAll(newPersons)); // should be true
        newPersons.add(person2);
        System.out.println("Contains all (person1 + 2)? " + persons.containsAll(newPersons)); // should be false
        persons.add(person2);
        System.out.println("Contains all (person1 + 2) take 2? " + persons.containsAll(newPersons)); // should be true
        System.out.println("----------------------------------");

        persons.print(); // size should be 5
        persons.removeAll(newPersons);
        persons.print(); // size should be 3
        persons.addAll(newPersons);
        persons.print(); // size should be 5
        persons.retainAll(newPersons);
        persons.print(); // size should be 2!

        persons.clear();
        persons.print(); // size should be 0
    }
}
