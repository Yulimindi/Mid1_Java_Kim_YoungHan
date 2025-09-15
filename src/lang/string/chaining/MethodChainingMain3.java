package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue(); // 참조값을 반환하기 때문에 한번에 . 사용하여 결과 출력할 수 있음
        // 반환된 참조값을 변수에 담아두지 않고 바로 사용하는것임

        System.out.println("result = " + result);
    }
}
