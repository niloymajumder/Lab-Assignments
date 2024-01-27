import java.util.Scanner;

public class SquareNum {
   public SquareNum() {
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.printf("Please enter a integer: ");
      int a = scan.nextInt();
      scan.close();
      int square = a * a;
      System.out.printf("The Square of the number is: %d", square);
   }
}
