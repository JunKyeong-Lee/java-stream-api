import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _22 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(80, 30, 20),
                new Student(40, 34, 26),
                new Student(85, 33, 90),
                new Student(20, 56, 70),
                new Student(43, 60, 23));
        studentList.stream()
                .flatMapToInt(student ->
                        IntStream.of(student.getKor(), student.getEng(), student.getMath()))
                .average()
                .ifPresent(avg -> System.out.println(Math.round(avg * 10) / 10));
    }
}

class Student {
    private int kor;
    private int eng;
    private int math;

    public Student(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
