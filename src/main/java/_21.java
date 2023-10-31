import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _21 {
    public static void main(String[] args) {
        /* FlatMap을 사용하는 경우*/
        List<String> list = Arrays.asList("abcdef", "ghijkl");
        Stream<String> stream1 = list.stream();
        Stream<String[]> stream2 = stream1.map(s -> s.split(""));
        Stream<String> stream3 = stream2.flatMap(Arrays::stream);
        Stream<String> stream4 = stream3.distinct();
        List<String> stream5 = stream4.collect(Collectors.toList());
        System.out.println(stream5);
    }
}
