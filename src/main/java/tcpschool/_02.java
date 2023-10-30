package tcpschool;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _02 {
    public static void main(String[] args) {
        /*
         * 2. 배열에 관한 스트림을 생성하려면
         * Arrays 클래스의 다양한 형태의 stream() 메서드가 클래스 메서드로 정의되어 있다.
         * int, long, double 형 같은 기본타입도 스트림이 별도로 정의되어 있다.
         * 이를 이용한다.*/
        int[] arr1 = new int[]{4, 2, 3, 1};
        IntStream stream1 = Arrays.stream(arr1); // java.util.stream.IntStream 사용
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        String[] arr2 = new String[]{"넷", "둘", "셋", "하나"};
        Stream<String> stream2 = Arrays.stream(arr2, 1, 3); // 시작점과 끝점
        // 시작점 포함, 끝점 미포함. 즉 둘 셋
        stream2.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
