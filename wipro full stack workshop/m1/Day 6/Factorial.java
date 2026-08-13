public class Factorial {
    public static int factorial(int input1) {
        int fact = 1;
        for (int i = 1; i <= input1; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
