package collections.abstrac;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

public class SingleQueue<E> extends AbstractQueue {
    private E data;
    @Override
    public Iterator iterator() {
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        return data == null ? 0 : 1;
    }

    @Override
    public boolean offer(Object o) {
        if(data == null) {
            data = (E) o;
            return true;
        }
        return false;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }
}
