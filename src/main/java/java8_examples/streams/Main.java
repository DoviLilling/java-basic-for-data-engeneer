package java8_examples.streams;

import lab0.Person;
import lombok_examples.Beer;
import lombok_examples.Customer;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {


        List<Customer> list = List.of(
                Customer.builder().age(15).name("Moshe").build(),
                Customer.builder().age(12).name("Shiasdasdasdma").build(),
                Customer.builder().age(12).name("Shima").build(),
                Customer.builder().age(12).name("Akinu").build());

        Stream<Customer> customerStream = list.stream().filter(customer -> customer.getName().length() < 10);



        List<Customer> customerList = customerStream.collect(Collectors.toList());

        customerList.stream()
                .flatMap(customer -> customer.getBeers().stream());

        customerList.stream().forEach(System.out::println);

        OptionalInt max = customerList.stream().mapToInt(Customer::getAge).max();
        max.ifPresent(System.out::println);


        System.out.println(list);



    }

   static class PersonToNameMapper implements Function<Person,String> {

        @Override
        public String apply(Person person) {
            return person.getName();
        }
    }
}
