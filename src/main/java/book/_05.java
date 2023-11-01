package book;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _05 {
    public static void main(String[] args) {
        /*
         * collect()를 사용하여 다음 세가지 연산
         * 원소에 대한 평균
         * , 원소의 제곱 값에 대한 평균
         * , 원소를 하이픈('-') 으로 연결한 문자열로 수집.
         * 위의 세가지 결과를 출력하는 프로그램을 작성하라.
         * 각 연산은 당연하지만 결과가 나올때마다 스트림을 다시 생성해야 한다.*/
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(
                stream.collect(Collectors.averagingInt(Integer::intValue))
        );
        System.out.println("-------------------------");
        stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(
                stream.collect(Collectors.averagingInt(i -> i * i))
        );
        System.out.println("-------------------------");
        stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(
                stream
                        .map(i -> String.valueOf(i))
                        .collect(Collectors.joining("-"))
        );
        System.out.println("-------------------------");
        stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(
                stream
                        .map(String::valueOf)
                        .collect(Collectors.joining("-"))
        );
    }
}
