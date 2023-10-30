public class _01 {
    public static void main(String[] args) {
        /*
         * 함수형이 아닌 프로그래밍을 이용했을 때
         * 1. 단어의 크기가 2 이상인 경우를 필터링하고
         * 2. 모든 단어를 대문자로 변환하고
         * 3. 모든 단어를 앞글자만 잘라내어 변환하고
         * 4. 모든 단어를 스페이스로 구분하여 하나의 문자열로 합친다.*/
        String[] strings = {"aaa", "bbb", "cc", "d", "eeeeee", "ff", "asdq"};
        String[] newStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() >= 2) {
                newStrings[i] = strings[i];
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null)
                continue;
            strings[i] = strings[i].toUpperCase();
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null)
                continue;
            strings[i] = strings[i].substring(0, 1);
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null)
                continue;
            sb.append(strings[i] + " ");
        }
        System.out.println(sb);
    }
}
