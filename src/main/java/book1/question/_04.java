package book1.question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _04 {
    public static void main(String[] args) {
        /*
         * Nation.nations 리스트에서 육지에 있는 나라 이름을 콤마와 공백(", ")
         * 으로 연결하여 수집한 후 출력하는 프로그램을 작성하라.
         * (문제만 푸는 것이므로 단순화 시킵니다.)*/
        String[] arr = {"미국", "캐나다", "영국", "프랑스", "독일"};
        System.out.println(
                Arrays
                        .stream(arr)
                        .collect(Collectors.joining(", "))
        );
    }
}
