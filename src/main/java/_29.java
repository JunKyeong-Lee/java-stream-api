import java.util.stream.Stream;

public class _29 {
    public static void main(String[] args) {
Stream.of("a", "b", "c", "d", "e")
        .filter(filter -> {
            System.out.println("filter = " + filter);
            return true;
        })
        .forEach(foreach -> System.out.println("foreach = " + foreach));
    }
}
