package chapter_04.base;

import chapter_04.base.impl.Stack;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest
{

    @Test
    public void testPeek()
    {
        /*
         * CASE_1
         */
        Stack stack = new Stack(4);
        assertTrue(stack.isEmpty());

        try
        {
            stack.pop();
            fail();
        } catch (IllegalArgumentException ex)
        {
            assertTrue(ex.getMessage().contains("The stack is empty!"));
        }
        try
        {
            stack.peek();
            fail();
        } catch (IllegalArgumentException ex)
        {
            assertTrue(ex.getMessage().contains("The stack is empty!"));
        }
        assertTrue(stack.isEmpty());

        /*
         * CASE_2
         */
        stack.push(1);
        assertEquals(1, stack.peek());
        assertEquals(1, stack.peek());

        assertEquals(1, stack.pop());
        try
        {
            stack.pop();
            fail();
        } catch (IllegalArgumentException ex)
        {
            assertTrue(ex.getMessage().contains("The stack is empty!"));
        }

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.peek());
        assertEquals(4, stack.peek());

        assertTrue(stack.isFull());
    }

    @Test
    public void testEmptyOrFullStack()
    {
        /*
         * CASE_1
         */
        // 1. filling
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        try
        {
            stack.push(4);
            fail();
        } catch (IllegalArgumentException ex)
        {
            assertTrue(ex.getMessage().contains("The stack is full!"));
        }

        // 2. removing
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());

        try
        {
            stack.pop();
            fail();
        } catch (IllegalArgumentException ex)
        {
            assertTrue(ex.getMessage().contains("The stack is empty!"));
        }

        // 3. extracting
        try
        {
            stack.peek();
            fail();
        } catch (IllegalArgumentException ex)
        {
            assertTrue(ex.getMessage().contains("The stack is empty!"));
        }
    }
}