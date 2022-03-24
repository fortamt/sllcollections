package com.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void size() {
        var stack = new SinglyLinkedList<String>();
        assertEquals(0, stack.size());
    }

    @Test
    void clear() {
    }

    @Test
    @DisplayName("After adding one element size should be 1")
    void push0() {
        var stack = new SinglyLinkedList<String>();
        stack.push("#1");
        assertEquals(1, stack.size());
    }

    @Test
    @DisplayName("After adding one element peek should equal the added element")
    void push1() {
        var stack = new SinglyLinkedList<String>();
        String element = "#1";
        stack.push(element);

        var res = stack.peek();

        assertEquals(element, res);
    }

    @Test
    @DisplayName("After adding two elements peek should equal the latest added element")
    void push2() {
        var stack = new SinglyLinkedList<String>();
        String element1 = "#1";
        String element2 = "#2";
        stack.push(element1);
        stack.push(element2);

        var res1 = stack.pop();
        var res2 = stack.pop();

        assertEquals(element2, res1);
        assertEquals(element1, res2);
    }

    @Test
    @DisplayName("Test that empty collection throws NoSuchElementException when pop()")
    void pop() {
        var stack = new SinglyLinkedList<String>();
        assertThrows(NoSuchElementException.class,
                () -> {
                    stack.pop();
                });
    }

    @Test
    @DisplayName("After push pop returns the pushed element")
    void pop1() {
        var stack = new SinglyLinkedList<String>();
        String element = "#1";
        stack.push(element);

        var res = stack.pop();

        assertEquals(element, res);
    }

    @Test
    @DisplayName("After push & pop size is 0")
    void pop2() {
        var stack = new SinglyLinkedList<String>();
        String element = "#1";
        stack.push(element);
        stack.pop();

        assertEquals(0, stack.size());
    }

    @Test
    void peek() {
    }

    @Test
    void iterator() {
    }
}