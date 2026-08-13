public class MostFrequentDigit {
    public static int mostFrequentDigit(int input1, int input2, int input3, int input4) {
        int[] freq = new int[10];
        int[] inputs = {input1, input2, input3, input4};

        for (int num : inputs) {
            int temp = Math.abs(num);
            if (temp == 0) {
                freq[0]++;
            }
            while (temp > 0) {
                freq[temp % 10]++;
                temp /= 10;
            }
        }

        int maxFreq = -1;
        int resultDigit = 0;
        for (int i = 0; i <= 9; i++) {
            if (freq[i] >= maxFreq) {
                maxFreq = freq[i];
                resultDigit = i;
            }
        }
        return resultDigit;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentDigit(123, 456, 789, 111));
    }
}
