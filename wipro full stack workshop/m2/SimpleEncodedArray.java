public class SimpleEncodedArray {
    public static class Result {
        public final int output1;
        public final int output2;

        public Result(int output1, int output2) {
            this.output1 = output1;
            this.output2 = output2;
        }
    }

    public static Result findOriginalArray(int[] input1, int input2) {
        int[] original = new int[input2];
        original[input2 - 1] = input1[input2 - 1];

        for (int i = input2 - 2; i >= 0; i--) {
            original[i] = input1[i] + original[i + 1];
        }

        int sum = 0;
        for (int num : original) {
            sum += num;
        }

        return new Result(original[0], sum);
    }

    public static void main(String[] args) {
        int[] encoded = {2, 5, 1, 7, 9, 3};
        Result res = findOriginalArray(encoded, encoded.length);
        System.out.println("First element: " + res.output1);
        System.out.println("Sum: " + res.output2);
    }
}
