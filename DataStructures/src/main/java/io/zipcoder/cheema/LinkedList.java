package io.zipcoder.cheema;

public abstract class LinkedList<E> {
    
    private int size;
    private E head;
    private E tail;

    public abstract E add();

    public abstract E remove();

    public abstract boolean contains();

    public abstract int find();

    public abstract int size();

    public abstract E get();

}
