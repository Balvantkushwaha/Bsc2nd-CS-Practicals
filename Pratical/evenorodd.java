package Pratical;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = obj.nextInt();
        if (num % 2 == 0) {
            System.out.println("this is number even");

        } else {
            System.out.println("this is not even number or this is number odd");
        }

    }
}
