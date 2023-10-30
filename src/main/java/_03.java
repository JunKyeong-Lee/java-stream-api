import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _03 {
    public static void main(String[] args) {
List<String> myList = Arrays.asList("123", "162", "4256", "11", "5422", "23");

String count = myList
        .stream() // 생성
        .filter(s -> s.startsWith("1")) // 가공
        .sorted() // 가공
        .collect(Collectors.joining(" ")); // 결과
System.out.println(count);
    }
}
