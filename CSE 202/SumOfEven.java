import java.util.Scanner;

public class SumOfEven {

    public static void main(String[] args) {
        int num, n, EvenSum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a Number: ");
        num = scan.nextInt();
        scan.close();

        while (num != 0) {
            n = num % 10;
            if (n% 2 == 0) {
                EvenSum = EvenSum + n;
            }
            num = num / 10;
        }

        System.out.printf("Summation of Even Number is: %d", EvenSum);
    }
}
