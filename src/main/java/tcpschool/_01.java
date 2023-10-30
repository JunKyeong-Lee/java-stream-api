package tcpschool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _01 {
    public static void main(String[] args) {
        /*
         * 1. Collection 인터페이스에는 stream() 메소드가 정의되어 있다.
         * 즉, Collection 인터페이스를 구현한 모든 컬렉션 클래스에서도 stream() 메소드로
         * 스트림을 생성할 수 있다.
         * 그리고 parallelStream() 메소드를 사용하면 병렬 처리가 가능한 스트림을 생성할 수 있다.*/
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        Stream<Integer> stream = list.stream();
//        stream.forEach((i) -> System.out.println(i)); // 람다식
        stream.forEach(System.out::println); // 메서드 레퍼런스 식
    }
}
