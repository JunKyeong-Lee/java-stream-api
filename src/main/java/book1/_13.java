package book1;

import java.util.Comparator;
import java.util.stream.Stream;

public class _13 {
    public static void main(String[] args) {
        Stream.of("d1", "a2", "b1", "c", "a66")
                .sorted()
                .forEach(System.out::print);
        System.out.println("\n--");
        Stream.of("d1", "a2", "b1", "c", "a66")
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                })
                .forEach(System.out::print);
        System.out.println("\n--");
        Stream.of("d1", "a2", "b1", "c", "a66")
                .sorted((o1, o2) -> o1.compareTo(o2))
                .forEach(System.out::print);
    }
}