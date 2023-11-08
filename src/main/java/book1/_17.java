package book1;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class _17 {
    public static void main(String[] args) {
        Stream<Nation> s1 = Nation.nations.stream();
        s1.reduce((n1, n2) -> n1
                        .getPopulation() > n2.getPopulation() ? n1 : n2)
                .ifPresent(System.out::println); // Optional 값이므로 이와 같이 출력해야한다.
        // 이런식으로 두 값중 하나를 선택하는 방식도 가능하다.

        Stream<Nation> s2 = Nation.nations.stream();
        double sumOfPopulation = s2
                .filter(n -> n.getGdpRank() <= 20)
                .mapToDouble(n -> n.getPopulation())
                .reduce(0.0, (p1, p2) -> p1 + p2);

        System.out.println("GDP가 20위 이하인 나라의 인구 총합은 " + sumOfPopulation + "백만명");
        DoubleSummaryStatistics dss = Nation
                .nations
                .stream()
                .filter(n -> n.getGdpRank() <= 20)
                .mapToDouble(Nation::getPopulation)
                .summaryStatistics();
        System.out.println(dss.getSum());
    }
}
