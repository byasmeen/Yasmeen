
public class isOdd {
    public static int isOdd(int input1) {
        if (input1 % 2 != 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(isOdd(15));
        System.out.println(isOdd(-4));
        System.out.println(isOdd(0));
    }
}
