import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter 10 integers\n");

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            numbers[i] = scan.nextInt();
        }

        System.out.printf("Divisible by 3 or 5 but not both:");

        for (int num : numbers)   // for-each loop: For each integer num in the array called numbers
        {
            if (num % 3 == 0 && num % 5 != 0) {
                System.out.printf("%d",num);
            } else if (num % 3 != 0 && num % 5 == 0) {
                System.out.printf("%d",num);
            }
        }
    }
}
