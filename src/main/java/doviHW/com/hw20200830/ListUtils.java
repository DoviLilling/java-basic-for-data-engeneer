package doviHW.com.hw20200830;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dovi Lilling
 */
public class ListUtils {
    public static <T> List<T> sort(List<T> list, MyComperator comparator){
        List<T> newList = new ArrayList<>(list);
        for (int i = 0; i < newList.size() - 1; i++) {
            for (int j = i + 1; j < newList.size(); j++) {
                if (comparator.myCompare(newList.get(i), newList.get(j)) > 0){
                    T x = newList.get(i);
                    newList.set(i, newList.get(j));
                    newList.set(j, x);
                }
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(5, 3, 2, 1, 4);
        List<String> strings = List.of("Evgeny", "Pavel", "Avigail", "Dovi", "Shai");
        List<Integer> sortedInts;
        List<String> sortedStrings;

        sortedInts = ListUtils.sort(ints, (a, b) -> ((Integer) a - (Integer) b));
        System.out.println("Sorted ints:");
        System.out.println("~~~~~~~~~~~~");
        for (Integer anInt : sortedInts) {
            System.out.println(anInt);
        }
        System.out.println();

        sortedStrings = ListUtils.sort(strings, (a, b) -> (a.toString().compareTo(b.toString())));
        System.out.println("Sorted strings:");
        System.out.println("~~~~~~~~~~~~~~~");
        for (String sortedString : sortedStrings) {
            System.out.println(sortedString);
        }
    }
}
