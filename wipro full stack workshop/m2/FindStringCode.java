public class FindStringCode {
    public static int findStringCode(String input1) {
        String[] words = input1.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "").toUpperCase();
            if (cleanWord.isEmpty()) {
                continue;
            }

            int sum = 0;
            int len = cleanWord.length();
            for (int i = 0; i < len / 2; i++) {
                int val1 = cleanWord.charAt(i) - 'A' + 1;
                int val2 = cleanWord.charAt(len - 1 - i) - 'A' + 1;
                sum += Math.abs(val1 - val2);
            }

            if (len % 2 != 0) {
                sum += cleanWord.charAt(len / 2) - 'A' + 1;
            }

            sb.append(sum);
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(findStringCode("World Wide Web"));
    }
}
