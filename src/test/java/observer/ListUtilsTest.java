package observer;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {


    @Test
    public void countDuplicates() {
        List<Integer> list = List.of(1, 2, 4, 2, 5, 5, 1);
        int answer = ListUtils.countDuplicates(list, 5);
        Assert.assertEquals(2,answer);
    }


    @Test
    public void countDuplicatesForObjects() {
        List<String> list = List.of("java", "java", "JAVA", "JaVa", "scala", "SCALA");
        int answer = ListUtils.countDuplicates(list, "java", (t1, t2) -> t1.equalsIgnoreCase(t2));
        int answer2 = ListUtils.countDuplicates(list, "java", (t1, t2) -> t1.equalsIgnoreCase(t2));
        int answer3 = ListUtils.countDuplicates(list, "java", (t1, t2) -> t1.equalsIgnoreCase(t2));
        int answer4 = ListUtils.countDuplicates(list, "java", (t1, t2) -> t1.equalsIgnoreCase(t2));
        System.out.println("answer = " + answer);

    }
}