package doviHW.com.hw20200823;

import junit.framework.TestCase;

import java.util.List;

public class ListUtilsTest extends TestCase {

    private List<Integer> ints = List.of(1, 2, 3);

    public void testForEachWithDelay1() throws InterruptedException {
        ListUtils.forEachWithDelay1(ints, 3000, (a) -> System.out.println(a));
    }

    public void testForEachWithDelay2() throws InterruptedException {
        ListUtils.forEachWithDelay2(ints, 2000, System.out::println);
    }
}