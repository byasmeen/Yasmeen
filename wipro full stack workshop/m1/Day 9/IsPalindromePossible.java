public class IsPalindromePossible {
    public static int isPalindromePossible(int input1) {
        int[] freq = new int[10];
        int temp = Math.abs(input1);
        while (temp > 0) {
            freq[temp % 10]++;
            temp /= 10;
        }
        int oddCount = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount <= 1) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindromePossible(21251));
        System.out.println(isPalindromePossible(1234));
    }
}
