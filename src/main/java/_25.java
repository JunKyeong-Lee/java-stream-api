import java.util.OptionalInt;
import java.util.stream.IntStream;

public class _25 {
    public static void main(String[] args) {
        OptionalInt reduced = IntStream.range(1, 4)
                .reduce((a, b) -> {
                    return Integer.sum(a, b);
                });
        reduced.ifPresent(System.out::println);
    }
}
