public class DigitSum {
    public static int digitSum(int input1) {
        boolean isNegative = input1 < 0;
        int n = Math.abs(input1);
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return isNegative ? -n : n;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(267));
        System.out.println(digitSum(-267));
    }
}
