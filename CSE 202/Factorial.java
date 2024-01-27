import java.util.Scanner;
 
public class Factorial {
  
    public static int factorial(int n)
    {
        if (n == 0)
            return 1;
 
        return n * factorial(n - 1);
    }
 
    public static void main(String[] args)
    {
        int num ;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a Number: ");
        num = scan.nextInt();
        scan.close();

        System.out.printf("Factorial of %d is %d", num, factorial(num));
    }
}