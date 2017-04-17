package chapter_02.binary_search;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchInSortArrayTest {

    @Test
    public void testFind() throws Exception {
        BinarySearchInSortArray arr = new BinarySearchInSortArray();
        assertTrue(arr.find(2));
        assertFalse(arr.find(222));
        assertTrue(arr.find(22));
    }
}