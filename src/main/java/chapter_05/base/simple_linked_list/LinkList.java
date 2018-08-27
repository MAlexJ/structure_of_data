package chapter_05.base.simple_linked_list;

import chapter_05.base.simple_linked_list.impl.Link;

public interface LinkList
{
    void insertFirst(int id, String data);

    Link deleteFirst();

    Link find(int key);

    Link delete(int key);

    void display();

    boolean isEmpty();
}
