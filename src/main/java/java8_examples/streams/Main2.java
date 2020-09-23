package java8_examples.streams;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main2 {

   static AtomicInteger counter=new AtomicInteger(0);


    public static void main(String[] args) {


        Stream.generate(() -> 1).limit(1000000).parallel().forEach(num -> {
            counter.incrementAndGet();
        });

        System.out.println("counter = " + counter);


//        Stream.iterate(1,integer -> integer+1).skip(10).limit(20).forEach(System.out::println);
//        Stream.generate(Math::random).takeWhile(aDouble -> aDouble!=0.5).forEach(System.out::println);



//        File file = new File("data/yest.txt");

//        System.out.println("number = " + WordUtils.numberOfWords(file));

    }
}
