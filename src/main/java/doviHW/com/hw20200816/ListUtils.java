package doviHW.com.hw20200816;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dovi Lilling
 */
public class ListUtils {
    public static <T>  int countOccurrences(List<T> list, T t, ListItemCompare comp) {
        int counter = 0;
        for (T item : list) {
            if (comp.compare(item, t)){counter++;}
        }
        return counter;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(2);

        System.out.println("Integer duplication of 1: " + countOccurrences(integerList, 1, (t1, t2) -> t1.equals(t2)));
        System.out.println("Integer duplication of 2: " + countOccurrences(integerList, 2, (t1, t2) -> t1.equals(t2)));

        List<String> stringList = new ArrayList<>();
        stringList.add("Evgeny");
        stringList.add("Pavel");
        stringList.add("Shai");
        stringList.add("Evgeny");
        stringList.add("Avigail");
        stringList.add("Evgeny");
        stringList.add("Dovi");

        System.out.println("String duplication of 'Avigail': " + countOccurrences(stringList, "Avigail", (t1, t2) -> t1.equals(t2)));
        System.out.println("String duplication of 'Evgeny': " + countOccurrences(stringList, "Evgeny", (t1, t2) -> t1.equals(t2)));
    }
}
