package com.collections;

public interface Stack<T> extends Collection<T> {
    boolean push(T element);
    T pop();
    default T peek() {
        T res = pop();
        push(res);
        return res;
    }
    default boolean add(T element) {
        return push(element);
    }
}