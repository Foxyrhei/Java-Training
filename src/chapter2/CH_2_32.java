package chapter2;
/*
(Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
and prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input.
 */

import java.util.Scanner;

public class CH_2_32 {
    // create a Scanner to obtain input from the command window
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        //Reset Number of positive, negative and zeros
        int numPositive = 0;
        int numZero = 0;
        int numNegative = 0;

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        System.out.print("Enter third integer: "); // prompt
        number3 = input.nextInt(); // read third number from user

        System.out.print("Enter foгrth integer: "); // prompt
        number4 = input.nextInt(); // read fourth number from user

        System.out.print("Enter fifth integer: "); // prompt
        number5 = input.nextInt(); // read fifth number from user

        //Count Positve Numbers

        if (number1 > 0)
            numPositive = numPositive + 1;
        if (number2 > 0)
            numPositive = numPositive + 1;
        if (number3 > 0)
            numPositive = numPositive + 1;
        if (number4 > 0)
            numPositive = numPositive + 1;
        if (number5 > 0)
            numPositive = numPositive + 1;

        //Count Negative Numbers

        if (number1 > 0)
            numNegative = numNegative + 1;
        if (number2 > 0)
            numNegative = numNegative + 1;
        if (number3 > 0)
            numNegative = numNegative + 1;
        if (number4 > 0)
            numNegative = numNegative + 1;
        if (number5 > 0)
            numNegative = numNegative + 1;

        //Count Zeros

        if (number1 == 0)
            numZero = numZero + 1;
        if (number2 == 0)
            numZero = numZero + 1;
        if (number3 == 0)
            numZero = numZero + 1;
        if (number4 == 0)
            numZero = numZero + 1;
        if (number5 == 0)
            numZero = numZero + 1;

        System.out.println("\n");

        //Displays the number of Positive, Negative and Zeros

        System.out.printf("Positive numbers = %d\n", numPositive);
        System.out.printf("Negative numbers = %d\n", numNegative);
        System.out.printf("Zero numbers = %d\n", numZero);

    }
}
