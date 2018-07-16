package chapter_04.base.impl;

import chapter_04.base.IStack;

public class Stack implements IStack
{
    private int elements[];
    private int maxSize;
    private int top;

    public Stack(int size)
    {
        this.maxSize = size - 1;
        this.top = -1;
        this.elements = new int[size];
    }

    @Override
    public void push(int num)
    {
        if (isFull())
        {
            throw new IllegalArgumentException("The stack is full!");
        }

        top = top + 1;
        elements[top] = num;
    }

    @Override
    public int pop()
    {
        if (isEmpty())
        {
            throw new IllegalArgumentException("The stack is empty!");
        }

        int num = elements[top];
        top = top - 1;
        return num;
    }

    @Override
    public int peek()
    {
        if (isEmpty())
        {
            throw new IllegalArgumentException("The stack is empty!");
        }

        return elements[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == maxSize;
    }
}
