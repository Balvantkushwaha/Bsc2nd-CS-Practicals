package CollegePraticalProgram;

// problem : write a program to print 1 t 07 weekday and
// print table, find factorial, find area of retangle uses by swith case statement in java .
import java.util.Scanner;

class sw {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("1 to 7 for week days");
        System.out.println("8. print table");
        System.out.println("9. Factorial ");
        System.out.println("10. Area of retangle ");
        System.out.println("enter the choice number 1 to 10 ");
        int num = obj.nextInt();
        switch (num) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wenesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            case 8:
                System.out.println("Enter the table no.");
                int n = obj.nextInt();
                System.out.println("table print");
                for (int i = 1; i <= 10; i++) {
                    int tab = n * i;
                    System.out.println(tab);
                }
                break;
            case 9:

                System.out.println("Enter the factorial num");

                int f = obj.nextInt();
                int fact = 1;
                for (int j = 1; j <= f; j++)
                    fact = fact * j;
                System.out.println("factorial  : " + fact);

                break;

            case 10:
                System.out.println("Enter the recctanglel ki L and W");
                int l = obj.nextInt();
                int w = obj.nextInt();
                int ra = l * w;
                System.out.println("Area of rectangele : " + ra);
                break;

            default:
                System.out.println("our choice is wrong ");
                break;
        }
    }
}