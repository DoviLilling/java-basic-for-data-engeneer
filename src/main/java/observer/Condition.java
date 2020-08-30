package observer;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Condition<T> {
    boolean shouldRemain(T t);
}
