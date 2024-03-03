package CollegePraticalProgram;

import java.util.Scanner;

public class pnp {
    public static void primeAndNotPrime() {
        System.out.println("enter the any number");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }

        System.out.println("divided by " + count);
        if (count == 2) {

            System.out.println(num + " is prime number");
        }

        else {
            System.out.println(num + " is non prime number");
        }
    }
}
