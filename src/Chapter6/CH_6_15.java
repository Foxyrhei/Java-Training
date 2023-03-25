package Chapter6;
/*
(Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given.
The method should take two arguments of type double and return the hypotenuse as a double. Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse
method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]
 */

import java.util.Scanner;

public class CH_6_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter first side of right triangle as floating point: ");
        double sideA = input.nextDouble();

        System.out.printf("Enter second side of right triangle as floating point: ");
        double sideB = input.nextDouble();

        double result = calculation(sideA, sideB);

        System.out.printf("Hypotenuse is: " + result);
    }

    public static double calculation(double sideA, double sideB) {
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return hypotenuse;
    }
}
