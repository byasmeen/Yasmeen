import java.math.BigInteger;

public class AdditionUsingStrings {
    public static String additionUsingStrings(String input1, String input2) {
        BigInteger num1 = new BigInteger(input1);
        BigInteger num2 = new BigInteger(input2);
        return num1.add(num2).toString();
    }

    public static void main(String[] args) {
        System.out.println(additionUsingStrings("123456789123456789", "987654321987654321"));
    }
}
