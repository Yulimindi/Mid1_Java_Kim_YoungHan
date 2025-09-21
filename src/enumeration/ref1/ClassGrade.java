package enumeration.ref1;

public class ClassGrade {
    // static 사용하여 상수를 메서드 영역에 선언
    // final 사용하여 인스턴스 변경 제한
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    public ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
