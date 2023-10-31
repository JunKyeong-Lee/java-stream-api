import java.util.stream.Stream;

public class _31 {
    public static void main(String[] args) {
        Stream.of("a", "b", "c", "d", "e")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
