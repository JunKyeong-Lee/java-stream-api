import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _14 {
    public static void main(String[] args) {
        /*
         * 원시 스트림에서 스트림으로
         * 스트림에서 원시 스트림으로*/
        IntStream
                .range(1, 10) // 1 2 3 4 5 6 7 8 9
                .mapToObj(i -> "a" + i) // a1 a2 a3 ... a9(문자열로)
                .forEach(System.out::println); // 출력
        System.out.println("----------");
        Stream
                .of(1.0, 4.2, 6.33) // 1.0, 4.2, 6.33 으로
                .mapToInt(Double::intValue) // double에서 int 값으로
                .mapToObj(i -> "a" + i) // int 값을 문자열로
                .forEach(System.out::println); // 출력
    }
}
