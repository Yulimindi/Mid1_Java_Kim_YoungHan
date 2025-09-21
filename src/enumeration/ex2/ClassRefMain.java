package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass()); // .getClass = 클래스 정보 출력
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass()); // 모두 ClassGrade 기반으로 인스턴스를 만들었기에 결과는 모두 ClassGrade임
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("ref DIAMOND = " + ClassGrade.BASIC); // 각각 상수는 서로 다른 ClassGrade 인스턴스를 참조하기에 참조값이 다르게 출력됨
        System.out.println("ref DIAMOND = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);

    }
}
