public class CountEvenOrOdd {
    public static int countEvenOrOdd(int input1, int input2, int input3, int input4, int input5, String type) {
        int count = 0;
        if (type.equalsIgnoreCase("even")) {
            if (input1 % 2 == 0)
                count++;
            if (input2 % 2 == 0)
                count++;
            if (input3 % 2 == 0)
                count++;
            if (input4 % 2 == 0)
                count++;
            if (input5 % 2 == 0)
                count++;
        } else {
            if (input1 % 2 != 0)
                count++;
            if (input2 % 2 != 0)
                count++;
            if (input3 % 2 != 0)
                count++;
            if (input4 % 2 != 0)
                count++;
            if (input5 % 2 != 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countEvenOrOdd(1, 2, 3, 4, 5, "even"));
    }
}
