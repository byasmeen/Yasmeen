public class DecreasingSequence {
    public static class Result {
        public final int output1;
        public final int output2;

        public Result(int output1, int output2) {
            this.output1 = output1;
            this.output2 = output2;
        }
    }

    public static Result decreasingSequence(int[] input1, int input2) {
        int seqCount = 0;
        int maxLen = 0;
        int currentLen = 1;

        for (int i = 0; i < input2 - 1; i++) {
            if (input1[i] > input1[i + 1]) {
                currentLen++;
            } else {
                if (currentLen > 1) {
                    seqCount++;
                    if (currentLen > maxLen) {
                        maxLen = currentLen;
                    }
                    currentLen = 1;
                }
            }
        }

        if (currentLen > 1) {
            seqCount++;
            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }

        return new Result(seqCount, maxLen);
    }

    public static void main(String[] args) {
        int[] arr = {11, 3, 1, 4, 7, 8, 12, 2, 3, 7};
        Result res = decreasingSequence(arr, arr.length);
        System.out.println("Count: " + res.output1);
        System.out.println("Max Length: " + res.output2);
    }
}
