package chapter_05.base.simple_linked_list;

import chapter_05.base.simple_linked_list.impl.LinkListImpl;

public class RunApp
{
    public static void main(String[] args)
    {
        LinkListImpl list = new LinkListImpl();

        list.display();
        list.insertFirst(1, "one");
        list.insertFirst(2, "two");
        list.insertFirst(3, "three");
        list.insertFirst(4, "four");
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.display();

        System.out.println("List is empty: " + list.isEmpty());
    }
}
