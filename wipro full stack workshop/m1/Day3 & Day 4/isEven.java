
public class isEven {
    public static int isEven(int input1) {
        if (input1 % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEven(14));
        System.out.println(isEven(-5));
        System.out.println(isEven(0));
    }
}
