package chapter_05.base.iterator;

import chapter_05.base.iterator.entity.Link;

public interface LinkList
{
    Link getFirs();

    void setFirst(Link link);

    boolean isEmpty();

    ListIterator getListIterator();

    void displayList();
}
