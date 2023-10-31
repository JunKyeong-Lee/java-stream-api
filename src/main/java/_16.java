import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _16 {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product(23, "potatoes"),
                new Product(14, "orange"),
                new Product(13, "lemon"),
                new Product(23, "bread"),
                new Product(13, "sugar"));
        /* 1. Collectors.toList()
         * 번외편 toSet()
         * 컬렉션으로 변화시킨다.*/
        List<String> nameList =
                productList
                        .stream() // 스트림으로 바꾸고
                        .map(Product::getName) // 이름만 가져온 다음에
                        .collect(Collectors.toList()); // 이 이름들을 List로 변환한다.
        for (var x : nameList)
            System.out.print(x + " ");
        System.out.println();
        System.out.println("============================");
        /* 2. Collectors.joining(String delimiter, String prefix, String suffix)
         * delimiter : 구분자
         * prefix : 결과 맨 앞에 붙는 문자열
         * suffix : 결과 맨 뒤에 붙는 문자열
         * 각 문자열 원소를 이어붙인다.*/
        String nameListToString =
                productList
                        .stream()
                        .map(Product::getName)
                        .collect(Collectors.joining());
        System.out.println(nameListToString);
        nameListToString =
                productList
                        .stream()
                        .map(Product::getName)
                        .collect(Collectors.joining(", "));
        System.out.println(nameListToString);
        nameListToString =
                productList
                        .stream()
                        .map(Product::getName)
                        .collect(Collectors.joining(", ", "<<", ">>"));
        System.out.println(nameListToString);
        System.out.println("============================");
        /* 3. Collectors.averagingInt(), Collectors.summingInt(), Collectors.summarizingInt()
         * 평균값이나 총합이나 합을 구할 수 있다.
         * 다른 구현방법도 있지만 이러한 방법도 있다는 사실..*/
        Double averageAmount =
                productList
                        .stream()
                        .collect(
                                Collectors.averagingInt(Product::getAmount));
        System.out.println(averageAmount);
        Integer summingAmount =
                productList
                        .stream()
                        .collect(
                                Collectors.summingInt(Product::getAmount));
        System.out.println(summingAmount);
        IntSummaryStatistics statistics =
                productList
                        .stream()
                        .collect(
                                Collectors.summarizingInt(Product::getAmount));
        System.out.println("statistics = " + statistics);
        System.out.println("statistics.getCount() = " + statistics.getCount());
        System.out.println("statistics.getSum() = " + statistics.getSum());
        System.out.println("statistics.getMin() = " + statistics.getMin());
        System.out.println("statistics.getAverage() = " + statistics.getAverage());
        System.out.println("statistics.getMax() = " + statistics.getMax());
        System.out.println("============================");
        /* 4. Collectors.groupingBy()
         * Strea에서 작업한 결과를 특정 그룹으로 묶기
         * 결과는 Map으로 받게 된다. 매개변수로는 Function 인터페이스를 쓴다.
         * (예를 들어 결과값이 Map<Integer, List<Product>> 라면 Integer를 넣어서 List<Product> 가 나오는
         * 함수형 인터페이스. Function 인터페이스를 쓴다고 생각하면 된다.*/
        Map<Integer, List<Product>> collectorMapOfLists =
                productList
                        .stream()
                        .collect(Collectors.groupingBy(Product::getAmount));
// getAmount 를 기준으로 그루핑 하겠다.
        System.out.println(collectorMapOfLists);
        System.out.println("============================");
        /* 5. Collectors.partitioningBy()
         * groupingBy 와 차이점을 생각하며 읽어야 한다.
         * 이것은 매개변수로 함수형 인터페이스 Predicate 를 받는다.
         * Predicate라는건 어떤 값을 넣을때 Boolean 값이 반환된다.
         * 즉, Predicate 인터페이스의 결과값이 false 인지
         * true인지에 따라 값이 나뉘므로
         * Map<Boolean, List<Product>> 와 같이 처음에 선언해야 한다.*/
        Map<Boolean, List<Product>> mapPartitioned =
                productList
                        .stream()
                        .collect(Collectors.partitioningBy(p -> p.getAmount() > 20));
        System.out.println(mapPartitioned);
        System.out.println("============================");
    }
}

class Product {
    int amount;
    String name;

    public Product(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                '}';
    }
}