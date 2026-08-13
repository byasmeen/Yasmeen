public class AlternateAddSub {
    public static int alternateAddSub(int input1, int input2) {
        int result = input1;
        boolean add = (input2 == 1);

        for (int i = input1 - 1; i >= 1; i--) {
            if (add) {
                result += i;
            } else {
                result -= i;
            }
            add = !add;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(alternateAddSub(6, 1));
        System.out.println(alternateAddSub(6, 2));
    }
}
