public class NambiarNumberGenerator {
    public static long nambiarNumberGenerator(String input1) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int len = input1.length();

        while (i < len) {
            int firstDigit = input1.charAt(i) - '0';
            boolean startOdd = (firstDigit % 2 != 0);
            int sum = firstDigit;
            i++;

            while (i < len) {
                boolean currentSumOdd = (sum % 2 != 0);
                if (startOdd && !currentSumOdd) {
                    break;
                }
                if (!startOdd && currentSumOdd) {
                    break;
                }
                sum += input1.charAt(i) - '0';
                i++;
            }

            result.append(sum);
        }

        return Long.parseLong(result.toString());
    }

    public static void main(String[] args) {
        System.out.println(nambiarNumberGenerator("9880123456"));
    }
}
