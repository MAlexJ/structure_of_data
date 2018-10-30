package chapter_05.base.iterator.impl;

import chapter_05.base.iterator.LinkList;
import chapter_05.base.iterator.ListIterator;
import chapter_05.base.iterator.entity.Link;

public class ListIteratorImpl implements ListIterator
{
    /**
     * the current link
     */
    private Link current;

    /**
     * the previous link
     */
    private Link previous;

    /**
     * the linked list
     */
    private LinkList ourList;


}
