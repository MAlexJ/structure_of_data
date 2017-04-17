package chapter_02.listing_2_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class HighArrayTest {

    @Test
    public void testInsert() {
        HighArray ha = new HighArray(5);
        assertTrue(ha.insert(1));
        assertTrue(ha.insert(2));
        assertTrue(ha.insert(3));
        assertTrue(ha.insert(4));
        assertTrue(ha.insert(5));

        assertFalse(ha.insert(6));
        assertFalse(ha.insert(7));
    }

    @Test
    public void testDelete() {
        HighArray ha = new HighArray(5);
        assertTrue(ha.insert(1));
        assertTrue(ha.insert(2));
        assertTrue(ha.insert(3));
        assertTrue(ha.insert(4));
        assertTrue(ha.insert(5));

        assertTrue(ha.delete(2));
        assertFalse(ha.delete(2));

        ha.display();

        assertTrue(ha.delete(1));
        assertTrue(ha.delete(3));
        assertTrue(ha.delete(4));
        assertTrue(ha.delete(5));

        ha.display();

        for (long item : ha.getArray()) {
            assertEquals(0, item);
        }

        assertTrue(ha.insert(12));
        assertTrue(ha.insert(12));
        assertTrue(ha.insert(12));
        ha.display();

        assertTrue(ha.delete(12));
        ha.display();
    }

    @Test
    public void testFind() throws Exception {
        HighArray ha = new HighArray(5);
        assertTrue(ha.insert(1));
        assertTrue(ha.insert(2));
        assertTrue(ha.insert(3));
        assertTrue(ha.insert(4));
        assertTrue(ha.insert(5));

        assertTrue(ha.find(1));
        assertTrue(ha.find(2));
        assertTrue(ha.find(3));
        assertTrue(ha.find(4));

        assertFalse(ha.find(12));
    }
}