package book1;

import java.util.stream.Stream;

public class _11 {
    public static void main(String[] args) {
        Stream<Nation> n1 = Nation.nations.stream();
        Stream<String> s1 = n1.map(Nation::getName);
        s1.limit(4).forEach(System.out::println);

        Nation.nations.stream()
                .mapToInt(Nation::getGdpRank)
                .forEach(System.out::println);
    }
}
