package book1;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _03 {
    public static void main(String[] args) {
        int[] ia = {2, 3, 5, 7, 11, 13};
        IntStream is = Arrays.stream(ia);
        is.forEach(System.out::print);
        System.out.println();

        String[] strings = "The pen is mighter than the sword".split(" ");
        Stream<String> ss = Stream.of(strings);
        ss.forEach(System.out::print);
        System.out.println();

        double[] da = {1.2, 2.3, 3.4, 4.5, 6.7};
        DoubleStream ds = DoubleStream.of(da);
        ds.forEach(System.out::print);
    }
}
