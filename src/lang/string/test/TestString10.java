package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] result = fruits.split(",");
        for (String s : result) {
            System.out.println(s);
        }

        String joindeString = String.join("->", result);
        System.out.println(joindeString);
    }
}
