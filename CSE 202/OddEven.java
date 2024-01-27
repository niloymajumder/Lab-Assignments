import java.util.Scanner;
public class OddEven {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.printf("Please enter a integer: ");
      int n = scan.nextInt();
      scan.close();
      if (n % 2 == 0) {
         System.out.printf("Even");
      } else {
         System.out.printf("Odd");
      }

   }
}
