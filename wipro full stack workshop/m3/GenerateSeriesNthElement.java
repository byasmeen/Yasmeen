public class GenerateSeriesNthElement {
    public static int generateSeriesNthElement(int input1, int input2, int input3, int input4) {
        if (input4 == 1) return input1;
        if (input4 == 2) return input2;
        if (input4 == 3) return input3;

        int diff1 = input2 - input1;
        int diff2 = input3 - input2;
        int gap = diff2 - diff1;

        int currentTerm = input3;
        int currentDiff = diff2;

        for (int i = 4; i <= input4; i++) {
            currentDiff += gap;
            currentTerm += currentDiff;
        }

        return currentTerm;
    }

    public static void main(String[] args) {
        System.out.println(generateSeriesNthElement(1, 3, 6, 5));
    }
}
