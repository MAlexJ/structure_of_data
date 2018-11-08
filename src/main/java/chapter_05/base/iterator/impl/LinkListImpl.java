package chapter_05.base.iterator.impl;

import chapter_05.base.iterator.LinkList;
import chapter_05.base.iterator.ListIterator;
import chapter_05.base.iterator.entity.Link;
import java.util.Objects;

public class LinkListImpl implements LinkList {

    private Link link;

    @Override
    public Link getFirs() {
        return this.link;
    }

    @Override
    public void setFirst(Link link) {
        this.link = link;
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(this.link);
    }

    @Override
    public ListIterator getListIterator() {
        return new ListIteratorImpl(this);
    }

    @Override
    public void displayList() {
        Link current = this.link;
        while (!Objects.isNull(current)) {
            current.displayLink();
            current = current.getNext();
        }
    }
}
