package observer;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ObjectUtils {
    public <T> void printObjectsSorted(List<T> list, Comparator<T> comparator) {
        if (list.isEmpty()) {
            System.out.println("nothing to print list list is empty");
            return;
        }
        if (list.size() == 1) {
            System.out.println(list.get(0));
            return;
        }

        for (int i = 0; i < list.size()-1; i++) {
            T a = list.get(i);
            T b = list.get(i + 1);
            if (comparator.compare(a,b)) {
                list.set(i, b);
                list.set(i + 1, a);
            }
        }


    }
}
