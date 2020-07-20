package collections;

import lab0.Person;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        EvenNumberIterator evenNumberIterator = new EvenNumberIterator();
//        while (evenNumberIterator.hasNext()) {
//            Long next = evenNumberIterator.next();
//            System.out.println(next);
//        }

//
//        StupidPersonIterator iterator = new StupidPersonIterator();
//        while (iterator.hasNext()) {
//            Person person = iterator.next();
//            System.out.println(person.getName()+" : "+person.getAge());
//
//        }


        StupidPersonIterable people = new StupidPersonIterable();

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.getName()+" "+person.getAge());
        }

        iterator = people.iterator();

        while (iterator.hasNext()) {
            Person person =  iterator.next();
            System.out.println(person);

        }

        System.out.println("the end");


    }
}
