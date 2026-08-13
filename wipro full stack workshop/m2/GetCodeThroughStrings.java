public class GetCodeThroughStrings {
    public static int getCodeThroughStrings(String input1) {
        if (input1 == null || input1.trim().isEmpty()) {
            return 0;
        }

        String[] words = input1.trim().split("\\s+");
        int sum = 0;

        for (String word : words) {
            sum += word.length();
        }

        while (sum > 9) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getCodeThroughStrings("World Wide Web"));
    }
}
