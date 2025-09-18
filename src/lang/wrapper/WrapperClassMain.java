package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 valueOf() 사용
        Integer integerObj = Integer.valueOf(10); // valueOf() : 기본형 -> 객체
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue(); // intValue() : 객체 -> 기본형
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj)); // 다른 참조를 보고 있기에 false 나옴.
        System.out.println("equals : " + (newInteger.equals(integerObj))); // 그렇기에 equals 사용해야함.
    }
}
