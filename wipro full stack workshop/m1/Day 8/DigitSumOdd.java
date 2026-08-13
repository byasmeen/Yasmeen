public class DigitSumOdd {
    public static int digitSumOdd(int input1) {
        int sum = 0;
        int n = Math.abs(input1);
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitSumOdd(123456));
    }
}
