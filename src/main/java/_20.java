import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _20 {
    public static void main(String[] args) {
        /* FlatMap의 동작방식 전에 어거지로 map 하는 경우*/
        List<String> list = Arrays.asList("abcdef", "ghijkl");
        Stream<String> stream1 = list.stream();
        Stream<String[]> stream2 = stream1.map(s -> s.split(""));
        Stream<String[]> stream3 = stream2.distinct();
        List<String[]> stream4 = stream3.collect(Collectors.toList());
    }
}
