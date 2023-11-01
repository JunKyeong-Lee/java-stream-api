package book1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class _01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(30));
        }
        List<Integer> gt10 = new ArrayList<>();
        for (var i : list) {
            if (i > 10)
                gt10.add(i);
        }
        Collections.sort(gt10);
        System.out.println(gt10);
    }
}
