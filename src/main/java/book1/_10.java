package book1;

import java.util.stream.Stream;

public class _10 {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");
        s1.map(String::toUpperCase)
                .forEach(System.out::print);
        System.out.println();
        Stream.of(1, 2, 1, 3, 3, 2, 4)
                .map(i -> i * 2)
                .forEach(System.out::print);
        System.out.println();

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .mapToObj(i -> "b" + i)
                .forEach(System.out::print);
    }
}
