package Chapter4;
/*
(Salary Calculator) Develop a Java application that determines the gross pay for each of
three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40.
You’re given a list of the employees, their number of hours worked last week and their hourly rates.
Your program should input this information for each employee,
then determine and display the employee’s gross pay.
Use class Scanner to input the data.
 */

import java.util.Scanner;

public class CH_4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double hoursWorked;
        double rate = 0;
        double overtime;
        double grossPay;

        System.out.printf("Enter number of hours worked last week %n(type -1 to quit)%n");
        hoursWorked = input.nextDouble();


        while ((hoursWorked != -1) && (rate != -1)){

            System.out.printf("Enter hourly rate %n(type -1 to quit)%n");
            rate = input.nextDouble();

            if (hoursWorked > 40) {
                overtime = hoursWorked - 40;
                grossPay = (40 * rate) + (overtime * 1.5 * rate);
                System.out.printf("Employee's gross pay is: %.2f%n", grossPay);
            }
            else if (hoursWorked <= 40){
                grossPay = hoursWorked * rate;
                System.out.printf("Employee's gross pay is: %.2f%n", grossPay);
            }
            else {
                System.out.printf("No data entered");
            }

            System.out.printf("Enter number of hours worked last week %n(type -1 to quit)%n");
            hoursWorked = input.nextDouble();
        }
    }
}
