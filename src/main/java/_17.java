import java.util.Arrays;
import java.util.List;

public class _17 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eric", "Elena", "Java");

        boolean anyMatch = names.stream()
                .anyMatch(name -> name.contains("a")); // 하나라도 참이므로 참
        boolean allMatch = names.stream()
                .allMatch(name -> name.length() > 3); // 모두 길이가 3을 넘으므로 참
        boolean noneMatch = names.stream()
                .noneMatch(name -> name.endsWith("s")); // 모두 끝이 s가 아니므로 참
        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);
    }
}
