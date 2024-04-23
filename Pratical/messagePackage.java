package Pratical;

import java.util.Scanner;

public class messagePackage {
    public static void mypackage() {
        System.out.println("welcome package");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }

        System.out.println(totLength);

    }
}
