package com.collections;

public interface Queue<T> extends Collection<T> {
    boolean enqueue(T element);
    T dequeue();
    T peek();
}
