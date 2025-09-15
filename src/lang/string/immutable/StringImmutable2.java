package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        // String은 불변 객체, 변경 필요한 경우 기존 값 변경 X 새로운 결과 만들어 반환 O
        String str1 = "hello";
        String str2 = str1.concat(" java");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
