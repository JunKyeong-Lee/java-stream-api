public class _04 {
    public static void main(String[] args) {
        i f = (int a, int b) -> a > b ? a : b;
        System.out.println(f.max(3, 5));
    }
}

@FunctionalInterface
interface i {
    int max(int a, int b);
}
