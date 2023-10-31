import java.util.OptionalInt;
import java.util.stream.IntStream;

public class _15 {
    public static void main(String[] args) {
        OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
        int max = IntStream.of().max().orElse(0);
        System.out.println(min.getAsInt());
        System.out.println(max);
        System.out.println(IntStream
                .of(1, 3, 5, 7, 9)
                .sum());
        System.out.println(IntStream
                .of(1, 3, 5, 7, 9)
                .count());
        System.out.println(IntStream
                .of(1, 3, 5, 7, 9)
                .average().getAsDouble());
    }
}
