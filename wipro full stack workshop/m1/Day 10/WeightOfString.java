public class WeightOfString {
    public static int weightOfString(String input1, int input2) {
        if (input1 == null) {
            return 0;
        }
        int totalWeight = 0;
        String str = input1.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                boolean isVowel = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
                if (input2 == 0 && isVowel) {
                    continue;
                }
                totalWeight += (ch - 'A' + 1);
            }
        }
        return totalWeight;
    }

    public static void main(String[] args) {
        System.out.println(weightOfString("Hello", 0));
        System.out.println(weightOfString("Hello", 1));
    }
}
