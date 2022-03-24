package com.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList<T> implements Stack<T> {
    private static class Node<V> {
        V value;
        Node<V> next;

        public Node() {
            next = this;
        }

        public Node(V value, Node<V> next) {
            this.value = value;
            this.next = next;
        }
    }

    final Node<T> head = new Node<>();
    int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean push(T element) {
        var newNode = new Node<T>(element, head.next);
        head.next = newNode;
        size++;
        return true;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("The collection is empty");
        }
        var firstNode = head.next;
        head.next = firstNode.next;
        firstNode.next = null;
        size--;
        return firstNode.value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("The collection is empty");
        }
        return head.next.value;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
