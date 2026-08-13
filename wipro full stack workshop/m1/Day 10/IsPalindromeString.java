public class IsPalindromeString {
    public static int isPalindromeString(String input1) {
        if (input1 == null) {
            return 1;
        }
        String str = input1.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return 1;
            }
            left++;
            right--;
        }
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeString("Madam"));
        System.out.println(isPalindromeString("Wipro"));
    }
}
