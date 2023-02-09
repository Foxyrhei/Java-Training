package chapter2;
/*
(Multiples) Write an application that reads two integers, determines whether the first is a
multiple of the second and prints the result. [Hint: Use the remainder operator.]
 */

import java.util.Scanner;

public class CH_2_26 {
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; // Integer input from user
        int number2; // Integer input from user
        int rem; //variable for storing odd / even calculation

        System.out.print("Enter integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter integer: "); // prompt
        number2 = input.nextInt(); // read second number from user


        rem = number1 % number2; // remainder calculation

        if (rem == 0) {
            System.out.print(number1 + " is a multiple of " + number2);
        }

        if (rem != 0) {
            System.out.print(number1 + " and " + number2 + " are not multiple of each other");
        }
    }
}
