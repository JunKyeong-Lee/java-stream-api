package book;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _08 {
    public static void main(String[] args) {
        /*
         * 피타고라스 정리를 만족하는 3가지 정수로 구성된 집합을 생성하는
         * 스트림을 생성하라.*/
        IntStream stream1 = IntStream.rangeClosed(1, 100);
        Stream<Integer> stream2 = stream1.boxed();
        Stream<int[]> stream3 = stream2.flatMap(a -> IntStream.rangeClosed(a, 100).boxed().map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}));
        // 이 부분은 꽤 흥미롭다.
        Stream<int[]> stream4 = stream3.filter(arr -> arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]);
        stream4.forEach(arr -> System.out.print("{" + arr[0] + ", " + arr[1] + ", " + arr[2] + "}" + " "));
        System.out.println();
    }
}
