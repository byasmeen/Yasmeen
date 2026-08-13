public class UserIdGeneration {
    public static String userIdGeneration(String input1, String input2, int input3, int input4) {
        String smallerName;
        String longerName;

        if (input1.length() < input2.length()) {
            smallerName = input1;
            longerName = input2;
        } else if (input2.length() < input1.length()) {
            smallerName = input2;
            longerName = input1;
        } else {
            if (input1.compareToIgnoreCase(input2) < 0) {
                smallerName = input1;
                longerName = input2;
            } else {
                smallerName = input2;
                longerName = input1;
            }
        }

        char lastCharSmaller = smallerName.charAt(smallerName.length() - 1);
        String pinStr = String.valueOf(input3);

        char leftDigit = pinStr.charAt(input4 - 1);
        char rightDigit = pinStr.charAt(pinStr.length() - input4);

        String initialId = lastCharSmaller + longerName + leftDigit + rightDigit;

        StringBuilder result = new StringBuilder();
        for (char ch : initialId.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(userIdGeneration("Rajiv", "Roy", 56001, 3));
    }
}
