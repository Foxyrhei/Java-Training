package Chapter6;

import java.util.Scanner;

/*
(Circle Area) Write an application that prompts the user for the radius of a circle and uses
a method called circleArea to calculate the area of the circle.
 */
public class CH_6_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter radius: ");
        double r = input.nextDouble();

        System.out.printf("Circle area is: %f", circleArea(r));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}
