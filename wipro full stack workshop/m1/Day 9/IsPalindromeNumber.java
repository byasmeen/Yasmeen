public class IsPalindromeNumber {
    public static int isPalindromeNumber(int input1) {
        int n = Math.abs(input1);
        int original = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        if (original == reversed) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121));
        System.out.println(isPalindromeNumber(123));
    }
}
