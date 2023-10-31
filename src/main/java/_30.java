import java.util.stream.Stream;

public class _30 {
    public static void main(String[] args) {
        Stream.of("a", "b", "c", "d", "e")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
    }
}
