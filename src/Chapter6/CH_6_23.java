package Chapter6;
/*
(Find the Minimum) Write a method minimum3 that returns the smallest of three floating point numbers.
Use the Math.min method to implement minimum3. Incorporate the method into an
application that reads three values from the user, determines the smallest value and displays the result.
 */

import java.util.Scanner;

public class CH_6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter first floating point number: ");
        double a = input.nextDouble();

        System.out.printf("Enter second floating point number: ");
        double b = input.nextDouble();

        System.out.printf("Enter third floating point number: ");
        double c = input.nextDouble();

        System.out.printf("Smallest value is: %.2f%n", minimum3(a, b, c));

    }

    public static double minimum3(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }
}
