package book1;

import java.util.stream.IntStream;

public class _15 {
    public static void main(String[] args) {
        System.out.println(IntStream.of(5, 1, 2, 3).min());
        System.out.println(IntStream.of(5, 1, 2, 3).max());
        System.out.println(IntStream.of(5, 1, 2, 3).count());
        System.out.println(IntStream.of(5, 1, 2, 3).average());
        System.out.println(IntStream.of(5, 1, 2, 3).sum());
    }
}
