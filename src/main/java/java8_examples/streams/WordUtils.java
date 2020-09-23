package java8_examples.streams;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class WordUtils {

    @SneakyThrows
    public static long numberOfWords(File file) {

        BufferedReader reader = new BufferedReader(new FileReader(file));

        Stream<String> lines = reader.lines();
        return lines.
                flatMap(line -> Arrays.stream(line.split(" ")))
                .count();

    }

    public static List<String> mostPopular(File file, int x) {
        return null;//todo write a method which find X most popular words
    }




}
