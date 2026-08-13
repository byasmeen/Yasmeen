public class CreatePin {
    public static int createPin(int input1, int input2, int input3) {
        int u1 = input1 % 10, t1 = (input1 / 10) % 10, h1 = (input1 / 100) % 10;
        int u2 = input2 % 10, t2 = (input2 / 10) % 10, h2 = (input2 / 100) % 10;
        int u3 = input3 % 10, t3 = (input3 / 10) % 10, h3 = (input3 / 100) % 10;

        int units = Math.min(u1, Math.min(u2, u3));
        int tens = Math.min(t1, Math.min(t2, t3));
        int hundreds = Math.min(h1, Math.min(h2, h3));

        int maxDigit = Math.max(u1, Math.max(t1, h1));
        maxDigit = Math.max(maxDigit, Math.max(u2, Math.max(t2, h2)));
        maxDigit = Math.max(maxDigit, Math.max(u3, Math.max(t3, h3)));

        return maxDigit * 1000 + hundreds * 100 + tens * 10 + units;
    }

    public static void main(String[] args) {
        System.out.println(createPin(123, 582, 175));
        System.out.println(createPin(190, 267, 853));
    }
}
