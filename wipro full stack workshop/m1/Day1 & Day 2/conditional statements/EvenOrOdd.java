import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        sc.close();
    }
}
