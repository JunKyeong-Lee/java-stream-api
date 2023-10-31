import java.util.stream.Stream;

public class _10 {
    public static void main(String[] args) {
        /*
         * filter*/
        Stream<Integer> stream = Stream.iterate(0, i -> i + 1);
        // 0부터 1씩 증가하는 무한한 스트림
        stream
                .filter(i -> i % 3 == 0) // i%3==0 인 경우만 필터링
                .limit(15) // 최대 출력 갯수 15개
                .forEach(i -> System.out.print(i + " "));
        // 각 요소의 출력방식
    }
}
