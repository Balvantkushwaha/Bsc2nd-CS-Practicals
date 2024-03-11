/*
write a program to calculate the salary of an employee .
if salary is greater than or equal to 20000 and year of service is greater than or equal to 5 year.
then bonus wil be 2000 otherwise 1000 and print grass salary of employee .
 */
package Pratical;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // input employee name , salary and year of service
        System.out.println("Enter the Employee Name");
        String employeeName = scn.nextLine();
        System.out.println("Enter the Emloyee Salary");
        int emplyeeSalary = scn.nextInt();
        System.out.println("Enter the Employee Year of Service ");
        short yearOfService = scn.nextShort();
        int bonus1 = 2000;
        int bonus2 = 1000;
        if (emplyeeSalary >= 20000 && yearOfService >= 5) {
            int grassSalaryOfEmployee = emplyeeSalary + bonus1;
            System.out.println("Employ Name = " + employeeName + "\n" + "Total Salary =" + grassSalaryOfEmployee);
        } else {
            int grassSalaryOfEmployee = emplyeeSalary + bonus2;
            System.out.println("Employ Name = " + employeeName + "\n" + "Total Salary =" + grassSalaryOfEmployee);
        }
    }
}
