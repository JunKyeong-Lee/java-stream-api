package book1;

import java.util.*;

public class _16 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 4, 5, 1, 2);

        int sum1 = numbers.stream().reduce(0, (a, b) -> a + b);
        int sum2 = numbers.stream().reduce(0, Integer::sum);
        int mul1 = numbers.stream().reduce(1, (a, b) -> a * b);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("mul1 = " + mul1);

        Optional<Integer> sum3 = numbers.stream().reduce(Integer::sum);
        OptionalInt sum4 = numbers.stream().mapToInt(x -> x.intValue()).reduce(Integer::sum);
        Optional<Integer> mul2 = numbers.stream().reduce((a, b) -> a * b);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
        System.out.println("mul2 = " + mul2);
        List<Integer> notNumbers = new ArrayList<>();
        System.out.println("notNumbers.stream().reduce((a, b) -> a * b) = \n\t\t" +
                notNumbers.stream().reduce((a, b) -> a * b));
    }
}
