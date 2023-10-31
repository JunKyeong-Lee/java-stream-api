import java.util.Arrays;
import java.util.stream.Stream;

public class _08 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream
                .of("a", "b", "c");
        Stream<String> stream2 = Stream
                .of(new String[]{"a", "b", "c"});
        Stream<String> stream3 = Arrays
                .stream(new String[]{"a", "b", "c"});
        Stream<String> stream4 = Arrays
                .stream(new String[]{"a", "b", "c"}
                        , 1, 3);
    }
}
