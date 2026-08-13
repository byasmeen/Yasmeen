public class NthPrime {
    public static int nthPrime(int input1) {
        int count = 0;
        int num = 1;
        while (count < input1) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
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
        System.out.println(nthPrime(1));
        System.out.println(nthPrime(5));
    }
}
