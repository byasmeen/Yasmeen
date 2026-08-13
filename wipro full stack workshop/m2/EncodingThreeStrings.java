public class EncodingThreeStrings {
    public static class Result {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String output1, String output2, String output3) {
            this.output1 = output1;
            this.output2 = output2;
            this.output3 = output3;
        }
    }

    private static String[] splitParts(String str) {
        int len = str.length();
        int rem = len % 3;
        int partLen = len / 3;

        int fLen, mLen, eLen;

        if (rem == 0) {
            fLen = partLen;
            mLen = partLen;
            eLen = partLen;
        } else if (rem == 1) {
            fLen = partLen;
            mLen = partLen + 1;
            eLen = partLen;
        } else {
            fLen = partLen + 1;
            mLen = partLen;
            eLen = partLen + 1;
        }

        String front = str.substring(0, fLen);
        String middle = str.substring(fLen, fLen + mLen);
        String end = str.substring(fLen + mLen);

        return new String[]{front, middle, end};
    }

    private static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static Result encodeThreeStrings(String input1, String input2, String input3) {
        String[] parts1 = splitParts(input1);
        String[] parts2 = splitParts(input2);
        String[] parts3 = splitParts(input3);

        String out1 = parts1[0] + parts2[0] + parts3[0];
        String out2 = parts1[1] + parts2[1] + parts3[1];
        String out3 = parts1[2] + parts2[2] + parts3[2];

        out3 = toggleCase(out3);

        return new Result(out1, out2, out3);
    }

    public static void main(String[] args) {
        Result res = encodeThreeStrings("John", "Johnny", "Janardhan");
        System.out.println("Output1: " + res.output1);
        System.out.println("Output2: " + res.output2);
        System.out.println("Output3: " + res.output3);
    }
}
