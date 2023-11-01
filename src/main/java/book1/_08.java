package book1;

import java.util.Optional;

public class _08 {
    public static void main(String[] args) {
        String s1 = "문자열";
        Optional<String> o = Optional.ofNullable(s1);

        if (o.isPresent())
            Util.print(o.get());
        else
            Util.print("없음");

        String s2 = o.orElse("없음");
        Util.print(s2);

        o.ifPresentOrElse(Util::print, () -> System.out.println("없음"));
    }
}
