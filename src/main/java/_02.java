import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _02 {
    public static void main(String[] args) {
        /*
         * 함수형 프로그래밍을 활용할 경우
         * 1. 단어의 크기가 2 이상인 경우를 필터링하고
         * 2. 모든 단어를 대문자로 변환하고
         * 3. 모든 단어를 앞글자만 잘라내어 변환하고
         * 4. 모든 단어를 스페이스로 구분하여 하나의 문자열로 합친다.*/
        String[] strings = {"aaa", "bbb", "cc", "d", "eeeeee", "ff", "asdq"};
        String stream = Arrays.stream(strings)
                .filter(w -> w.length() > 1)
                .map(String::toUpperCase)
                .map(w -> w.substring(0, 1))
                .collect(Collectors.joining(" "));
        System.out.println(stream);
    }
}
