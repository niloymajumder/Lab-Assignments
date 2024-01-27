import java.util.Scanner;
public class MaxMini{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int I = input.nextInt();
        int[] a =new int[I];
        int max = 0, min = 0;
        for(int i =0; i<I; i++){
            a[i]= input.nextInt();
        }
        max = a[0];
        min = a[0];
        for(int i =0; i <I; i++){
            if(max < a[i])
            max = a[i];
            if(max>a[i])
            min = a[i];
        }
        System.out.printf("Maximum Array Element is: "+max);
        System.out.printf("\nMinimum Array Element is: "+min);
    }
}