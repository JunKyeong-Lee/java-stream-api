import java.util.*;
import java.util.stream.Stream;

public class _28 {
    public static void main(String[] args) {
        List<String> nullList = null;

//        nullList.stream()
//                .filter(str->str.contains("a"))
//                .map(String::length)
//                .forEach(System.out::println);
        Optional.ofNullable(nullList) // null이 될 가능성이 있다는 뜻으로 Optional을 씌운다.
                .map(Collection::stream)
                .orElseGet(Stream::empty) // 여기서 Optional에 대한 처리가 끝나므로 벗겨진다.
                .filter(str -> str.contains("a"))
                .map(String::length)
                .forEach(System.out::println);
    }
}
