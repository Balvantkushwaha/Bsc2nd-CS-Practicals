//write a program to display grade according to marks obtained by the student 
package Pratical;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the student name");
        String studentName = scn.nextLine();
        System.out.println("enter the student marks 5 subject ");
        Float major1 = scn.nextFloat();
        Float major2 = scn.nextFloat();
        Float minor = scn.nextFloat();
        Float vocational = scn.nextFloat();
        Float sum = major1 + major2 + minor + vocational;
        double percentage = sum / 4;
        if (100 > percentage && percentage >= 75) {
            System.out.println(
                    "Student Name = " + studentName + "Student Percentage = " + percentage + " " + "Grade - A + ");
        } else if (75 > percentage && percentage >= 60) {
            System.out
                    .println("Student Name = " + studentName + "Student Percentage = " + percentage + " " + "grade A");
        } else if (60 > percentage && percentage >= 50) {
            System.out
                    .println("Student Name = " + studentName + "Student Percentage = " + percentage + " " + "grade B");
        } else if (50 > percentage && percentage >= 33) {
            System.out
                    .println("Student Name = " + studentName + "Student Percentage = " + percentage + " " + "grade C");
        } else if (33 > percentage) {
            System.out.println("Student Name = " + studentName + "Student Percentage = " + percentage + " " + "Fail");
        } else {
            System.out.println("Invailded marks ");
        }

    }
}
