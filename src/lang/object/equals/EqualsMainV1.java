package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2)); // 동일성 비교이기 때문에 false 나옴
        System.out.println("equality = " + (user1.equals(user2))); // 기본으로 제공하는 equals는 == 과 같음 그래서 동등성 비교를 위해 오버라이딩 해야함
    }
}
