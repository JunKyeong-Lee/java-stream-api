import java.util.stream.Stream;

public class _27 {
    public static void main(String[] args) {
        int reduced = Stream.of(1, 2, 3, 4)
                .reduce(100, Integer::sum, (a, b) -> {
                    System.out.println("combiner was called");
                    return a + b;
                });
        System.out.println(reduced);

        reduced = Stream.of(1, 2, 3, 4)
                .parallel()
                .reduce(100, Integer::sum, (a, b) -> {
                    System.out.println("combiner was called");
                    return a + b;
                });
        System.out.println(reduced);
    }
}
