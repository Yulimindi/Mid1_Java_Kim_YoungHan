package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("data1 = " + date1);
        System.out.println("data2 = " + date2);

        date1 = date1.withYear(2002);

        System.out.println("2002 -> date1");
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        // 불변 객체에서 값을 변경하는 경우 withYear()처럼 with로 시작하는 경우가 많음
        // 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포함하는 과정을 표현함
    }
}
