import java.util.stream.Stream;

public class _11 {
    public static void main(String[] args) {
        /*
         * map*/
        Stream<Integer> stream = Stream.iterate(0, i -> i + 1); // 0 1 2 3 ....
        stream
                .map(i -> i * 3) // 모든원소에 i * 3
                .limit(10) // 10개까지만
                .forEach(System.out::println); // 출력
    }
}