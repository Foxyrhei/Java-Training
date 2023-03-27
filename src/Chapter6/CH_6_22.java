package Chapter6;
/*
(Temperature Conversions) Implement the following integer methods:
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
calculation
celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
the calculation
fahrenheit = 9.0 / 5.0 * celsius + 32;
c) Use the methods from parts (a) and (b) to write an application that enables the user either to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
Celsius temperature and display the Fahrenheit equivalent.
 */

import java.util.Scanner;

public class CH_6_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter temperature value: ");
        double temp = input.nextDouble();

        System.out.printf("Enter unit of entered value: C or F: ");
        char value = input.next().charAt(0);

        switch (value) {
            case 'C':
            case 'c':
                System.out.printf("Fahrenheit equivalent is: %.2f%n", fahrenheit(temp));
                break;
            case 'F':
            case 'f':
                System.out.printf("Celsius equivalent is: %.2f%n", celsius(temp));
                break;
            default:
                System.out.printf("Incorrect unit selection");
        }

//        if (value == 'C') {
        //           System.out.printf("Fahrenheit equivalent is: %.2f%n", fahrenheit(temp));
//        } else if (value == 'F') {
        //           System.out.printf("Celsius equivalent is: %.2f%n", celsius(temp));
        //       } else {
        //           System.out.printf("Incorrect unit selection");
//        }
    }

    public static double celsius(double temp) {
        return 5.0 / 9.0 * (temp - 32);
    }

    public static double fahrenheit(double temp) {
        return 9.0 / 5.0 * temp + 32;
    }
}
