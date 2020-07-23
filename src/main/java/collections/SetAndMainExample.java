package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class SetAndMainExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("java");

        System.out.println("list.size() = " + list.size());

        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");
        set.add("java");

        System.out.println(set.size());


    }
}
