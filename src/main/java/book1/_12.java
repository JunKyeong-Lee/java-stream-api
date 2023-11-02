package book1;

import java.util.Arrays;
import java.util.List;

public class _12 {
    public static void main(String[] args) {
        var temp1 = List.of("안녕", "자바!", "잘 가","자자자, 바바바")
                .stream()
                .flatMap(s -> Arrays.stream(s.split(" ")));
        // flatMap은 마치 numpy의 배열 끼리 더하는것과 비슷하다.
        // 단순하게 생각하면 각 String은 Stream<String>이 되는 데,
        // 이를 옆으로 이어서 새로운 Stream<String>이 된다고 보면 된다.
        // 일반적인 map처럼 생각하면 Stream<String> 이 Stream<Stream<String>> 이 되어버리는 느낌이라면
        // flatMap은 Stream<String>의 각 원소를 -> Stream<String> + Stream<String> + Stream<String> + ... 으로 만든다.

        temp1.forEach(System.out::println);
    }
}
