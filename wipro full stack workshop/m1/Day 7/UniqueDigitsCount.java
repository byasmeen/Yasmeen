public class UniqueDigitsCount {
    public static int uniqueDigitsCount(int input1) {
        int[] freq = new int[10];
        int temp = Math.abs(input1);
        if (temp == 0) {
            return 1;
        }
        while (temp > 0) {
            freq[temp % 10]++;
            temp /= 10;
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(uniqueDigitsCount(292));
        System.out.println(uniqueDigitsCount(1015));
    }
}
