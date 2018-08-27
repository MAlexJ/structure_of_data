package chapter_05.base.simple_linked_list.impl;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Link
{
    private int iData;
    private String dData;
    private Link next;

    public Link(int iData, String dData)
    {
        this.iData = iData;
        this.dData = dData;
    }

    void displayLink()
    {
        StringBuilder sb = new StringBuilder("[");
        sb.append(iData);
        sb.append(",");
        sb.append(dData);
        sb.append("]");
        System.out.print(sb);
    }
}
