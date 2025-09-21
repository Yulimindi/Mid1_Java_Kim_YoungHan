package enumeration.ex2;

public class ClassGrade {
    // static 사용하여 상수를 메서드 영역에 선언
    // final 사용하여 인스턴스 변경 제한
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가

    private ClassGrade() {
    }
}
