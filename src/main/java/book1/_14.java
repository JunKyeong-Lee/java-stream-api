package book1;

import java.util.Optional;
import java.util.stream.Stream;

public class _14 {
    public static void main(String[] args) {
        boolean b1 = Stream.of(1, 2, 3)
                .allMatch(p -> p % 3 == 0);
        boolean b2 = Stream.of(1, 2, 3)
                .anyMatch(p -> p % 3 == 0);
        boolean b3 = Stream.of(1, 2, 3)
                .noneMatch(p -> p % 4 == 0);
        Optional<Integer> o1 = Stream.of(1, 2, 3)
                .findAny();
        Optional<Integer> o2 = Stream.of(4, 5).findFirst();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(o1);
        System.out.println(o2);
    }
}
