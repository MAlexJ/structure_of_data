package chapter_05.base.simple_linked_list.impl;

import chapter_05.base.simple_linked_list.LinkList;

import java.util.Objects;

/**
 * TODO <<<< Comment
 */
public class LinkListImpl implements LinkList
{
    private Link first;

    /**
     * insert to the top of the list
     * @param id ID
     * @param data the data
     */
    @Override
    public void insertFirst(int id, String data)
    {
        Link link = new Link(id, data);
        link.setNext(first);
        first = link;
    }

    /**
     * delete first element
     * @return the link {@Link}
     */
    @Override
    public Link deleteFirst()
    {
        if (isEmpty())
        {
            throw new IllegalArgumentException("List is empty!");
        }
        Link temp = first;
        first = temp.getNext();
        return temp;
    }

    @Override
    public Link find(int key)
    {
        return null;
    }

    @Override
    public Link delete(int key)
    {
        return null;
    }

    /**
     * Print all link
     */
    @Override
    public void display()
    {
        if (isEmpty())
        {
            System.out.println("[]");
            return;
        }
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.getNext();
        }
        System.out.println();
    }

    /**
     * is empty or not
     * @return is empty or not
     */
    @Override
    public boolean isEmpty()
    {
        return Objects.isNull(first);
    }
}
