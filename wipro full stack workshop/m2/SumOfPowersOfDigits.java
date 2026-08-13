public class SumOfPowersOfDigits {
    public static int sumOfPowersOfDigits(int input1) {
        String str = String.valueOf(Math.abs(input1));
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            int power;
            if (i == str.length() - 1) {
                power = 0;
            } else {
                power = str.charAt(i + 1) - '0';
            }
            sum += Math.pow(digit, power);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfPowersOfDigits(5821));
    }
}
