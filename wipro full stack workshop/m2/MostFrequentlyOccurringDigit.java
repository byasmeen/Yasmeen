public class MostFrequentlyOccurringDigit {
    public static int mostFrequentlyOccurringDigit(int[] input1, int input2) {
        int[] freq = new int[10];

        for (int i = 0; i < input2; i++) {
            int num = Math.abs(input1[i]);
            if (num == 0) {
                freq[0]++;
            }
            while (num > 0) {
                freq[num % 10]++;
                num /= 10;
            }
        }

        int maxFreq = -1;
        int resultDigit = -1;

        for (int d = 0; d <= 9; d++) {
            if (freq[d] >= maxFreq) {
                maxFreq = freq[d];
                resultDigit = d;
            }
        }

        return resultDigit;
    }

    public static void main(String[] args) {
        int[] arr = {1237, 262, 666, 140};
        System.out.println(mostFrequentlyOccurringDigit(arr, arr.length));
    }
}
