package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        // 열거형은 toString()을 재정의 하기 때문에 참조값을 직접 확인할 수 없음
        // 참조값 구하기 위해 refValue() 만듦
        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade)); // toHextString -> 16진수로 변환, identityHashCode(grade) -> 자바가 관리하는 객체의 참조값을 숫자로 변환
    }
}
