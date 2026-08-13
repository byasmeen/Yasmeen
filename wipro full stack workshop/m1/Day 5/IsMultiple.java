
public class IsMultiple {
    public static int isMultiple(int input1, int input2) {
        if (input1 == 0 || input2 == 0) {
            if (input1 == 0 && input2 == 0)
                return 2;
            return 1;
        }
        if (input1 % input2 == 0) {
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMultiple(15, 3));
        System.out.println(isMultiple(14, 3));
    }
}
