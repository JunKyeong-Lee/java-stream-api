package tcpschool;

import java.util.stream.Stream;

public class _03 {
    public static void main(String[] args) {
        /*
         * 3. 가변 매개변수
         * Stream 클래스의 of() 메서드를 사용하면 가변 매개변수를 전달받아 스트림 생성이 가능하다.*/
        Stream<Double> stream = Stream.of(4.2, 2.5, 3.1, 1.9);
        stream.forEach(System.out::println);
    }
}
