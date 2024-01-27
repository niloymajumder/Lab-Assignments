import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter two integers: ");
        int num1= scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        int max = (num1 > num2) ? num1 : num2;

        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                System.out.printf("The LCM of %d and %d is %d.", num1, num2, max);
                break;
            }
            ++max;
        }
    }

}
