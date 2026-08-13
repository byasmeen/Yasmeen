public class DigitSumOpt {
    public static int digitSumOpt(int input1, String input2) {
        int sum = 0;
        int n = Math.abs(input1);
        while (n > 0) {
            int digit = n % 10;
            if (input2.equalsIgnoreCase("even")) {
                if (digit % 2 == 0) {
                    sum += digit;
                }
            } else if (input2.equalsIgnoreCase("odd")) {
                if (digit % 2 != 0) {
                    sum += digit;
                }
            }
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitSumOpt(123456, "even"));
        System.out.println(digitSumOpt(123456, "odd"));
    }
}
