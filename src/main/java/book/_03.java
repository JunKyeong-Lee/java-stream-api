package book;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _03 {
    public static void main(String[] args) {
        /*
         * rangeClosed()와 매핑 연산을 사용하여 다음과 같은 실행결과가 출력되는
         * 프로그램을 작성하라.
         * A1 A2 A3 A4 A5 A6 A7 A8 A9 A10*/
        IntStream intStream = IntStream.rangeClosed(1, 10);

        Stream<String> stream = intStream.mapToObj(i -> "A" + i);
        stream.forEach(s -> System.out.print(s + " "));
    }
}
