package lombok_examples;

import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
//        Customer customer = Customer.builder().address("Asho").lastName("Kon").name("Moshe").build();

//        customer.withAge(12).withLastName(customer.getLastName().toUpperCase())

//        System.out.println(customer.getAddress());

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("data.txt")));



    }


}
