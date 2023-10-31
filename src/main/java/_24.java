import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _24 {
    public static void main(String[] args) {
List<Integer> list = Arrays.asList(1, 3, 5, 7, 2, 3, 4, 6, 7);

list.stream()
        .reduce(Integer::sum)
        .ifPresent(System.out::println);

System.out.println(list.stream()
        .collect(Collectors.summingInt(Integer::intValue)));

System.out.println(list.stream()
        .mapToInt(Integer::intValue)
        .sum());
    }
}
