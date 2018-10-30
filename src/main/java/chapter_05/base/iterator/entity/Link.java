package chapter_05.base.iterator.entity;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@RequiredArgsConstructor()
public class Link {

    @NonNull
    private int data;
    private Link next;

    public void displayLink() {
        System.out.println("Data: " + this.data);
    }
}
