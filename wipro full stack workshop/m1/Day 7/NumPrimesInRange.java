public class NumPrimesInRange {
    public static int numPrimesInRange(int input1, int input2) {
        int count = 0;
        for (int i = input1; i <= input2; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(numPrimesInRange(2, 10));
    }
}
