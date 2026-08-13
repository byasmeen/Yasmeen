public class SumOfSumsOfDigitsInCyclicOrder {
    public static int sumOfSumsOfDigitsInCyclicOrder(int input1) {
        String str = String.valueOf(Math.abs(input1));
        int totalSum = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                totalSum += str.charAt(j) - '0';
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSumsOfDigitsInCyclicOrder(5821));
    }
}
