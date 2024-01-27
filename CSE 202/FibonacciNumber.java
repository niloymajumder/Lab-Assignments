import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num1 = scan.nextInt();
        scan.close();

        int x = 0, y = 1, fab;

        System.out.printf("The Fibonacci series are: \n", num1);

        for (int i = 0; i < num1; i++) {
            if (i <= 1) {
                fab = i;
            } else {
                fab = x + y;
                x = y;
                y = fab;
            }
            System.out.printf("%d ", fab);
        }
    }

}
