package object_methods;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtil {

    public static int countDuplicates(List<?> list, Object o) {
        int counter=0;
        for (Object element : list) {
            if (element.equals(o)) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        List<String> strings = List.of("Java", "Python", "Groovy", "Scala", "Java", "Scala");
        int duplicates = ListUtil.countDuplicates(strings, "Python");
        System.out.println("duplicates = " + duplicates);
    }

}



