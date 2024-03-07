package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> extends ArrayList<E> {

    private final ArrayList<E> delegate;

    public MyStack() {
        delegate = this;
    }

    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E e = get(delegate.size() - 1);
        remove(delegate.size() -1 );
        return e;
    }

}
