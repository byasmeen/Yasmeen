public class SumOfNonPrimeIndexValues {
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int sumOfNonPrimeIndexValues(int[] input1, int input2) {
        int sum = 0;
        for (int i = 0; i < input2; i++) {
            if (!isPrime(i)) {
                sum += input1[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(sumOfNonPrimeIndexValues(arr, arr.length));
    }
}
