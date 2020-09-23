package java8_examples.streams;

import lombok_examples.Customer;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class MainCollectorsExample {
    public static void main(String[] args) {
        Customer jeka = Customer.builder().name("Jeka").age(42).build();
        Stream<Customer> stream = Stream.of(
                Customer.builder().name("Shay Solomon").age(42).build(),
                jeka,
                Customer.builder().name("Avigal B").age(18).build(),
                Customer.builder().name("Pavel").age(39).build(),
                Customer.builder().name("Tamara").age(18).build(),
                Customer.builder().name("Tamara").age(28).build()
        );

//        Set<Customer> list = stream.collect(Collectors.toSet());
//        List<Customer> list = stream.collect(Collectors.toList());
//        System.out.println("list = " + list);
//        Map<String, Integer> map = stream.collect(Collectors.toMap(Customer::getName, Customer::getAge, Integer::sum));


//        Map<Integer, List<Pair<String, Integer>>> map = stream.map(customer -> new Pair<>(customer.getName(), customer.getAge()))
//                .collect(Collectors.groupingBy(Pair::getV));
//        System.out.println("map = " + map);

        Map<Integer, Optional<Customer>> map = stream.collect(Collectors.groupingBy(Customer::getAge, Collectors.maxBy(Comparator.comparingInt(o -> o.getName().length()))));
        System.out.println("map = " + map);


        //todo find a way to group not customers, but only their names against the same age
        // [(42=["Shay","Jeka"]),()]



    }
}
















