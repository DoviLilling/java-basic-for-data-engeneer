package doviHW.com.hw20200830;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Dovi Lilling
 */
public class ListUtilsTest {
    @Test
    public void testSort() {
        List<Integer> ints = List.of(5, 3, 2, 1, 4);
        List<String> strings = List.of("Evgeny", "Pavel", "Avigail", "Dovi", "Shai");
        List<Integer> sortedInts = List.of(1, 2, 3, 4, 5);
        List<String> sortedStrings = List.of("Avigail", "Dovi", "Evgeny", "Pavel", "Shai");

        Assert.assertEquals(sortedInts, ListUtils.sort(ints, (a, b) -> ((Integer) a - (Integer) b)));
        Assert.assertEquals(sortedStrings, ListUtils.sort(strings, (a, b) -> (a.toString().compareTo(b.toString()))));
    }
}