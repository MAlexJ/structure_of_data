package chapter_05.base.iterator.entity;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@RequiredArgsConstructor()
public class Link {

    @NonNull
    private long dData;
    private Link next;

    public void displayLink() {
        System.out.println("dData: " + this.dData);
    }
}
