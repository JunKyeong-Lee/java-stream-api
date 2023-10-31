import java.util.Random;
import java.util.stream.Stream;

public class _13 {
    public static void main(String[] args) {
        Random random = new Random(); // 랜덤 인스턴스 생성
        Stream<Integer> stream = Stream
                .generate(random::nextInt) // generate 함수로 랜덤 스트림 생성
                .limit(100) // 길이 제한
                .map(i -> ((i % 100) + 100) % 100); // 0부터 99 사이
        long count = stream
                .peek(i -> System.out.print(i + " ")) // 내림차순 정렬 전
                .sorted((i1, i2) -> i2 - i1) // 내림차순으로 정렬
                .peek(i -> System.out.print("\n" + i)) // 내림차순 정렬 후
                .distinct()// 중복 제거
                .count(); // 갯수 확인 (100개인지 아닌지)
        System.out.println(count);
    }
}
