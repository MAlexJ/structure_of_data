/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_05.base.iterator;


import chapter_05.base.iterator.entity.Link;

/**
 * @author Alex
 */
public interface LinkList
{
    Link getFirs();

    void setFirst(Link link);

    boolean isEmpty();

    ListIterator getListIterator();

    void displayList();
}
