package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _06 {
    public static void main(String[] args) {
        /*
         * 6개의 수도("서울", "워싱턴", "베이징", "파리", "마드리드", "런던")
         * 와 대응하는 인구 수(973.7, 63.2, 2115.0, 224.4, 326.5, 853.9)
         * 2개의 리스트 객체를 사용하여 다음을 수행하는 프로그램을 작성해라.
         * 1. 수도 이름과 인구수를 나타내는 Population 클래스를 작성하되
         *   생성자와 모든 getter 메서드를 정의하고 toString도 오버라이딩
         * 2. 2개의 리스트로 Stream<Population> 을 생성한다.
         * 3. 다음 실행결과와 같이 인구수가 300.0을 초과하는 나라와 인구수를 출력한다.*/
        List<String> capitals = Arrays.asList("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
        List<Double> populations = Arrays.asList(973.7, 63.2, 2115.0, 224.4, 326.5, 853.9);
        List<Population> list = new ArrayList<>();
        for (int i = 0; i < capitals.size(); i++) {
            list.add(new Population(capitals.get(i), populations.get(i)));
        }
        Stream<Population> stream = list.stream();
        stream
                .filter(p -> p.population > 300.0)
                .forEach(System.out::println);
    }
}

class Population {
    String capital;
    double population;

    public Population() {
    }

    public Population(String capital, double population) {
        this.capital = capital;
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return capital + "(" + population + ")";
    }
}
