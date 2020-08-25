package java8_examples;

import java.io.Serializable;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class PrintAllConsumer implements Consumer<Object>, Serializable {
    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}
