
public class ReturnLastDigit {
    public static int lastDigitOf(int input1) {
        return Math.abs(input1 % 10);
    }

    public static void main(String[] args) {
        System.out.println(lastDigitOf(197));
        System.out.println(lastDigitOf(-197));
    }
}
