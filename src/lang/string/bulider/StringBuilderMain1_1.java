package lang.string.bulider;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder는 문자열 변경하는 동안 사용하다가 문자열 변경 끝나면 안전한 (가변)String으로 변환하는 것이 좋음
        // StringBuilder -> String
        String string = sb.toString();
        System.out.println("String = " + string);
    }
}
