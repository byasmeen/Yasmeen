public class DigitToRemoveForPalindrome {
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int digitToRemoveForPalindrome(int input1) {
        String str = String.valueOf(Math.abs(input1));
        if (isPalindrome(str)) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            String candidate = str.substring(0, i) + str.substring(i + 1);
            if (isPalindrome(candidate)) {
                return str.charAt(i) - '0';
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(digitToRemoveForPalindrome(123421));
        System.out.println(digitToRemoveForPalindrome(25152));
    }
}
