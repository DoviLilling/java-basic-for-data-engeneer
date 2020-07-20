package collections;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class EvenNumberIterator implements Iterator<Long> {


    private long counter = 0;

    @Override
    public boolean hasNext() {
        return counter <= Long.MAX_VALUE-10;
    }

    @Override
    public Long next() {


        return counter += 2;
    }
}
