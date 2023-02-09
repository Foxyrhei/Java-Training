package chapter2;/*
(Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.
[Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0 when divided]
 */
/*
(Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.
[Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0 when divided
 */

import java.util.Scanner;

public class CH_2_25 {
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; // Integer input from user
        int rem; //variable for storing odd / even calculation

        System.out.print("Enter integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        rem = number1 % 2; // remainder calculation

        if (rem == 0) {
            System.out.print(number1 + " is an even integer"); //if there is no remainder then it's even
        }

        if (rem != 0) {
            System.out.print(number1 + " is an odd integer"); //if there is a remainder then it's odd
        }
    }
}
