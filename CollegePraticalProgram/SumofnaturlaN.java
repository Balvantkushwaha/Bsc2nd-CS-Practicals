package CollegePraticalProgram;

import java.util.Scanner;

public class SumofnaturlaN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number st");
        int st = obj.nextInt();
        System.out.println("enter the number lt");
        int lt = obj.nextInt();
        int sum = 0;
        for (int i = st; i <= lt; i++) {
            sum = sum + i;
        }
        System.out.println("n of sum : " + sum);
    }
}
