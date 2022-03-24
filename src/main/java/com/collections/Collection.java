package com.collections;

public interface Collection<T> extends Iterable<T> {
    int size();
    boolean add(T element);
    void clear();

    default boolean isEmpty() {
        return size() == 0;
    }
}
