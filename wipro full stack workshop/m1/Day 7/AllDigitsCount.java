public class AllDigitsCount {
    public static int allDigitsCount(int input1) {
        if (input1 == 0) {
            return 1;
        }
        int count = 0;
        int temp = Math.abs(input1);
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(allDigitsCount(292));
        System.out.println(allDigitsCount(0));
    }
}
