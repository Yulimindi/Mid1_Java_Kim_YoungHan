package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2)); // 동일성 비교이기 때문에 false 나옴
        System.out.println("equality = " + (user1.equals(user2))); // 오버라이딩 완료. 동등성 비교 가능
    }
}
