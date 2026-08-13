
public class ReturnSecondLastDigit {
    public static int secondLastDigitOf(int input1) {
        int positiveNum = Math.abs(input1);
        if (positiveNum < 10) {
            return -1;
        }
        return (positiveNum / 10) % 10;
    }

    public static void main(String[] args) {
        System.out.println(secondLastDigitOf(197));
        System.out.println(secondLastDigitOf(-197));
        System.out.println(secondLastDigitOf(5));
    }
}
