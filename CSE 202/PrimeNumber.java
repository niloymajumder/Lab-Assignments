import java.util.Scanner;
public class PrimeNumber{
              public static void main(String[] args)
          {
              int num, m=0;
              Scanner scan = new Scanner(System.in);
              System.out.printf("Enter a Number: ");
              num = scan.nextInt();
              for(int i=2; i<num; i++)
               {
                 if(num%i == 0)
               {
                   m++;
                 break;
          }
       }
      
      if(m==0)
         System.out.printf("%d is a Prime Number", num);
      else
         System.out.printf("%d is not a Prime Number", num);
   }
}