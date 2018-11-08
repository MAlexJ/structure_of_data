package chapter_05.base.iterator.impl;

import chapter_05.base.iterator.LinkList;
import chapter_05.base.iterator.ListIterator;
import chapter_05.base.iterator.entity.Link;
import java.util.Objects;

public class ListIteratorImpl implements ListIterator {

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
    private LinkList list;

    public ListIteratorImpl(LinkListImpl list) {
        this.list = list;
        reset();
    }

    /**
     * Start at first
     */
    @Override
    public void reset() {
        this.current = this.list.getFirs();
        this.previous = null;
    }

    /**
     * Check end of list
     *
     * @return true if last link
     */
    @Override
    public boolean atEnd() {
        return Objects.isNull(this.current.getNext());
    }

    /**
     * go to next link
     */
    @Override
    public void nextLink() {
        this.previous = this.current;
        this.current = this.current.getNext();
    }

    @Override
    public Link getCurrent() {
        return this.current;
    }

    @Override
    public void insertAfter(int data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertBefore(int data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long deleteCurrent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
