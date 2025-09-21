package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        
        DiscountService discountService = new DiscountService();
        // 실수로 생성자를 만들 경우
        // ClassGrade newClassGrade = new ClassGrade();
        // int result = discountService.discount(newClassGrade, price);
        // System.out.println("newClassGrade 등급의 할인 금액 : " + result);
        // 외부에서 생성할 수 없도록 private 생성자 추가
        
    }
}
