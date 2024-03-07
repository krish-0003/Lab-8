package org.example;
import org.junit.Test;
import java.util.EmptyStackException;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class MyStackTest {
    @Test
    public void testPush() {
        MyStack<Integer> stack = new MyStack<>();

        // pushing elements onto the stack
        stack.push(1);
        stack.push(2);


        // Assert that the size of the stack is 2 after pushing elements
        assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        MyStack<Integer> stack = new MyStack<>();

        // popping elements from an empty stack should throw EmptyStackException
        assertThrows(EmptyStackException.class, stack::pop);

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // popping elements from the stack
        assertEquals(3, stack.pop().intValue()); // Here, use intValue() to compare Integer objects
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());

        // Assert that the size of the stack is 0 after popping all elements
        assertEquals(0, stack.size());

    }

    @Test
    public void testIsEmpty() {
        MyStack<Integer> stack = new MyStack<>();

        assertTrue(stack.isEmpty()); // Stack should be empty initially

        stack.push(55);
        assertFalse(stack.isEmpty()); // Stack should not be empty after pushing an element into the stack

        stack.pop();
        assertTrue(stack.isEmpty()); // Stack should be empty after popping all elements form it
    }

    @Test
    public void testSize() {
        MyStack<Integer> stack = new MyStack<>();

        assertEquals(0, stack.size()); // Stack's size should be 0 initially

        stack.push(10);
        assertEquals(1, stack.size()); // Stack's size should be 1 after pushing an element into the stack

        stack.pop();
        assertEquals(0, stack.size()); // Stack's size should be 0 after popping all elements form it
    }

}
