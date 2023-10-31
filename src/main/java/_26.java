import java.util.stream.IntStream;

public class _26 {
    public static void main(String[] args) {
System.out.println(IntStream.range(1, 4)
        .reduce(100, (x, y) -> {
            return Integer.sum(x, y);
        }));
    }
}
