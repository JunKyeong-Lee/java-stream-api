import java.util.stream.IntStream;

public class _09 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.range(1, 6);
        IntStream stream2 = IntStream.rangeClosed(1, 6);
        stream1.forEach(System.out::print);
        System.out.println();
        stream2.forEach(System.out::print);
    }
}
