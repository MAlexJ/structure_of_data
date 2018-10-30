package chapter_05.base.iterator;

import chapter_05.base.iterator.entity.Link;

/**
 * Iterator Methods
 * Additional methods can make the iterator a flexible and powerful class. All operations
 * previously performed by the class that involve iterating through the list, such
 * as insertAfter(), are more naturally performed by the iterator.
 */
public interface ListIterator
{

    /**
     * Sets the iterator to the start of the list
     */
    void reset();

    /**
     * Returns true if the iterator is at the end of the list
     */
    boolean atEnd();

    /**
     * Moves the iterator to the next link
     */
    void nextLink();

    /**
     * Returns the link at the iterator
     */
    Link getCurrent();

    /**
     * Inserts a new link after the iterator
     */
    void insertAfter(int data);

    /**
     * Inserts a new link before the iterator
     */
    void insertBefore(int data);

    /**
     * Deletes the link at the iterator
     */
    long deleteCurrent();
}
