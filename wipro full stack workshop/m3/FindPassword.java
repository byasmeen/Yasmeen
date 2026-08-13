public class FindPassword {
    private static boolean isStable(int num) {
        num = Math.abs(num);
        int[] freq = new int[10];
        while (num > 0) {
            freq[num % 10]++;
            num /= 10;
        }
        int count = -1;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                if (count == -1) {
                    count = freq[i];
                } else if (freq[i] != count) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] inputs = {input1, input2, input3, input4, input5};
        int stableSum = 0;
        int unstableSum = 0;

        for (int num : inputs) {
            if (isStable(num)) {
                stableSum += num;
            } else {
                unstableSum += num;
            }
        }

        return stableSum - unstableSum;
    }

    public static void main(String[] args) {
        System.out.println(findPassword(12, 1313, 122, 678, 898));
    }
}
