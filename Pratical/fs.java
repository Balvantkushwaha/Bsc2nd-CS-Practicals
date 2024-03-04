package Pratical;

import java.util.Scanner;

/**
 * fibonacciseries
 */
public class fs {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the no. of fibonacci secries ");
        int fs = obj.nextInt();

        int sum = 0;
        for (int i = 0; i <= fs; i++) {
            sum = sum + i;
            System.out.print("\t" + sum);
        }

    }
}