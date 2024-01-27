import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a day: ");
        int day = scan.nextInt();
        scan.close();
        int num = day % 7;

        switch (num) {
            case 0:
                System.out.printf("Saturday");
                break;
            case 1:
                System.out.printf("Sunday");
                break;
            case 2:
                System.out.printf("Monday");
                break;
            case 3:
                System.out.printf("Tuesday");
                break;
            case 4:
                System.out.printf("Wednesday");
                break;
            case 5:
                System.out.printf("Thursday");
                break;
            case 6:
                System.out.printf("Friday");
                break;    

            default:
                System.out.printf("Error");
        }

    }
}