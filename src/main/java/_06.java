import java.util.function.Function;

public class _06 {
    public static void main(String[] args) {
        Function<Integer, Integer> multi4 = i -> i * 4;
        Function<Integer, Integer> add6 = i -> i + 6;

        Function<Integer, Integer> function1 = add6.compose(multi4);
        Function<Integer, Integer> function2 = add6.andThen(multi4);

        System.out.println(function1.apply(5)); // multi4 를 진행하고 add6 을 진행한다.
        System.out.println(function2.apply(5)); // add6을 진행하고 multi4 를 진행한다.
        System.out.println(Function.identity().apply(5));


    }
}
