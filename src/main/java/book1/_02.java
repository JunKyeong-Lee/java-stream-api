package book1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class _02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(30));
        }
        list.stream()
                .filter(i -> i > 10)
                .sorted()
                .forEach(System.out::println);
    }
}
