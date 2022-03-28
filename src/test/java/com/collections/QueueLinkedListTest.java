package com.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
class QueueLinkedListTest {
    @Test
    void size() {
        var queue = new QueueLinkedList<>();
        assertEquals(0, queue.size());
    }

    @Test
    void clear() {
    }

    @Test
    @DisplayName("After adding one element size should be 1")
    void enqueue0() {
        var queue = new QueueLinkedList<>();
        queue.enqueue("#1");

        assertEquals(1, queue.size());
    }

    @Test
    @DisplayName("After adding one element peek should equal the added element")
    void enqueue1() {
        var queue = new QueueLinkedList<>();
        String element = "#1";
        queue.enqueue(element);

        var res = queue.peek();

        assertEquals(element, res);
    }

    @Test
    @DisplayName("After adding two element peek should equal the first element")
    void enqueue2() {
        var queue = new QueueLinkedList<>();
        String element1 = "#1";
        String element2 = "#2";
        queue.enqueue(element1);
        queue.enqueue(element2);

        var res = queue.peek();

        assertEquals(element1, res);
    }

    @Test
    @DisplayName("After deque() size should be 0")
    void dequeue() {
        var queue = new QueueLinkedList<>();
        queue.enqueue("#1");
        queue.dequeue();

        assertEquals(0, queue.size());
    }

    @Test
    @DisplayName("After deque() size should be 0")
    void dequeue1() {
        var queue = new QueueLinkedList<>();
        queue.enqueue("#1");
        var element2 = "#2";
        queue.enqueue(element2);
        queue.dequeue();

        var res = queue.dequeue();

        assertEquals(element2, res);
    }

    @Test
    @DisplayName("If queue empty should throws NoSuchElementException")
    void peek() {
        var queue = new QueueLinkedList<String>();
        assertThrows(NoSuchElementException.class,
                queue::peek);
    }

    @Test
    @DisplayName("After enqueue peek should return the pushed element")
    void peek1() {
        var queue = new QueueLinkedList<String>();
        String element = "#1";
        queue.enqueue(element);

        var res = queue.peek();

        assertEquals(element, res);
    }



    @Test
    void iterator() {
    }
}