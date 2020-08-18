package observer;

/**
 * @author Evgeny Borisov
 */
public interface Comparator<T> {
    boolean compare(T t1, T t2);

}
