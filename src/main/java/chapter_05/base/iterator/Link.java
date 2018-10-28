package chapter_05.base.iterator;

import lombok.Getter;
import lombok.Setter;

public class Link {

    @Setter
    @Getter
    private long dData;

    @Setter
    @Getter
    private Link next;

    public Link(long data) {
        this.dData = data;
    }

    public void displayLink() {
        System.out.println("dData: " + this.dData);
    }
}
