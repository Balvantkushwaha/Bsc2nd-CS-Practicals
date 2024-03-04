package Pratical;

import java.util.Scanner;

public class table {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter the start table num");
        int st = obj.nextInt();
        System.out.println("enter the last table num");
        int lt = obj.nextInt();
        for (int i = st; i <= lt; i++) {
            for (int j = 1; j <= 10; j++) {
                int tab = i * j;

                System.out.print("\t" + tab);

            }
            System.out.println("");

        }

    }
}
