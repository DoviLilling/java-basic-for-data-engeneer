package doviHW.com.hw20200823;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * @author Dovi Lilling
 */
public class ListUtils {
    public static <T> void forEachWithDelay1(List<T> list, int delay, Consumer action) throws InterruptedException {
        Objects.requireNonNull(action);
        for (T t : list) {
            Thread.sleep(delay);
            action.accept(t);
        }
    }

    public static <T> void forEachWithDelay2(List<T> list, int delay, MyConsumer action) throws InterruptedException {
        Objects.requireNonNull(action);
        for (T t : list) {
            Thread.sleep(delay);
            action.act(t);
        }
    }
}
