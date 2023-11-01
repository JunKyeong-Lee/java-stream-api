package book1.question;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _07 {
    public static void main(String[] args) {
        /*
         * 문자열 리스트 ("민국", "지우", "하준", "지우", "하준", "지우")
         * 문자열과 빈도수로 구성된 Map 타입으로 수집한 후 출력하는 프로그램을 작성해라.
         * (힌트: 단어별 빈도수로 그룹핑하려면 각 단어에 대하여 그룹핑하면서 단어 수를 카운팅하면 된다.)*/

        System.out.println(Stream.of("민국", "지우", "하준", "지우", "하준", "지우")
                .collect(Collectors.groupingBy(word -> word, Collectors.counting())));

    }
}
