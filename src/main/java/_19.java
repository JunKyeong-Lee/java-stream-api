import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _19 {
    public static void main(String[] args) {
        // <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
        List<List<String>> list = Arrays.asList(
                Arrays.asList("a", "b", "c", "d")
                , Arrays.asList("aa", "bb", "cc", "dd"));
        // flatten!
        List<String> flattenList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flattenList);
        System.out.println("---------------------------");
        // 2차원 배열
        Stream<String[]> strStream = Stream.of(
                new String[]{"a", "b", "c"},
                new String[]{"d", "e", "f"}
        );
        Stream<Stream<String>> stream2dim = strStream.map(Arrays::stream);
        Stream<String> stream1dim = stream2dim.flatMap(Function.identity());
        stream1dim.forEach(System.out::println);
    }
}
