public class IsPrime {
    public static int isPrime(int input1) {
        if (input1 <= 1) {
            return 1;
        }
        for (int i = 2; i <= Math.sqrt(input1); i++) {
            if (input1 % i == 0) {
                return 1;
            }
        }
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(10));
    }
}
