import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter 10 integer numbers:");

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Output numbers divisible by 3 or 5 but not both
        System.out.println("Numbers divisible by 3 or 5 but not both:");

        for (int num : numbers) {
            if (num % 3 == 0 && num % 5 != 0) {
                System.out.println(num);
            } else if (num % 3 != 0 && num % 5 == 0) {
                System.out.println(num);
            }
        }
    }
}

