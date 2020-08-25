package java8_examples;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("java", "scala", "python");


        list.forEach(System.out::println);

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

//        list.sort();
    }
}
