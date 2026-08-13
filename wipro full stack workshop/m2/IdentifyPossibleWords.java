public class IdentifyPossibleWords {
    public static String identifyPossibleWords(String input1, String input2) {
        String pattern = input1.toUpperCase();
        String[] candidates = input2.split(":");
        StringBuilder result = new StringBuilder();

        for (String candidate : candidates) {
            String word = candidate.toUpperCase();
            if (word.length() != pattern.length()) {
                continue;
            }

            boolean matches = true;
            for (int i = 0; i < pattern.length(); i++) {
                char pChar = pattern.charAt(i);
                char wChar = word.charAt(i);
                if (pChar != '_' && pChar != wChar) {
                    matches = false;
                    break;
                }
            }

            if (matches) {
                if (result.length() > 0) {
                    result.append(":");
                }
                result.append(word);
            }
        }

        if (result.length() == 0) {
            return "ERROR-009";
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(identifyPossibleWords("Fi_ter", "Filter:Filser:Fighter:FITTER"));
    }
}
