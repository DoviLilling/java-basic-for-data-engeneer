package observer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "ccc");
        ListUtils.printElementsWhichMatch(list, s -> s.length() < 2);
        ListUtils.printElementsWhichMatch2(list, s -> s.length() < 2);

    }


    public static <T> List<T> sort(List<T> list){
        //todo add additional parameter to this method which will be comparator, (you can use custom interface or not)
        // this method should return sorted list
        //todo write test (JUnit4)
        return null;
    }

    public static <T> void printElementsWhichMatch(List<T> objects, Condition<T> condition) {
        for (T object : objects) {
            if (condition.shouldRemain(object)) {
                System.out.println(object);
            }
        }
    }

    public static <T> void printElementsWhichMatch2(List<T> objects, Predicate<T> predicate) {
        for (T object : objects) {
            if (predicate.test(object)) {
                System.out.println(object);
            }
        }
    }

    public static <T> int countDuplicates(List<T> list, T t) {
        int counter = 0;

        for (T t1 : list) {
            if (t1.equals(t)) {
                counter++;
            }
        }
        return counter;
    }


    public static <T> int countDuplicates(List<T> list, T t, Equalator<T> equalator) {
        int counter = 0;

        for (T t1 : list) {
            if (equalator.equals(t1, t)) {
                counter++;
            }
        }
        return counter;
    }
}
