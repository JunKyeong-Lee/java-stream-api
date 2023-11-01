package book1;

import java.util.stream.IntStream;

public class _05 {
    public static void main(String[] args) {
        IntStream
                .iterate(0, i -> i + 1) // IntStream
                .limit(10) // IntStream
                .filter(i -> {
                    System.out.println("filter");
                    return i % 2 == 0;
                }) // IntStream
                .map(i -> {
                    System.out.println("map");
                    return i * 2;
                }); // IntStream
    }
}
