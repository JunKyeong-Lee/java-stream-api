import java.util.Arrays;
import java.util.List;

public class _18 {
    public static void main(String[] args) {
List<String> names = Arrays.asList("Eric", "Elena", "Java");
names.stream()
        .forEach(System.out::println);
    }
}
