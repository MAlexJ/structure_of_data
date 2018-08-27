package chapter_05.base.simple_linked_list;

import chapter_05.base.simple_linked_list.impl.Link;
import chapter_05.base.simple_linked_list.impl.LinkListImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkListImplTest
{
    @Test
    public void testEmptyList()
    {
        LinkList list = new LinkListImpl();
        assertTrue(list.isEmpty());

        list.insertFirst(1, "one");
        assertFalse(list.isEmpty());

        list.deleteFirst();
        assertTrue(list.isEmpty());
    }
    
    @Test
    public void test()
    {
        LinkList list = new LinkListImpl();
        list.insertFirst(1, "one");
        Link link = list.deleteFirst();
        assertEquals(link, new Link(1, "one"));
        assertTrue(list.isEmpty());
    }
}