import java.util.Random;
import java.util.stream.Stream;

public class _12 {
    public static void main(String[] args) {
        Random random = new Random(); // 랜덤 인스턴스 생성
        Stream<Integer> stream = Stream
                .generate(random::nextInt) // generate 함수로 랜덤 스트림 생성
                .limit(100) // 길이 제한
                .map(i -> ((i % 100) + 100) % 100); // 0부터 99 사이
        stream
                .sorted((i1, i2) -> i2 - i1) // 내림차순으로 정렬
                .forEach(System.out::println); // 출력
    }
}
