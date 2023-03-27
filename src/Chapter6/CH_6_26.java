package Chapter6;
/*
(Reversing Digits) Write a method that takes an integer value and returns the number with its digits reversed.
For example, given the number 7631, the method should return 1367.
Incorporate the method into an application that reads a value from the user and displays the result.
 */

import java.util.Scanner;

public class CH_6_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter integer number: ");
        int number = input.nextInt();

        reverseDigits(number);
    }

    public static void reverseDigits(int number) {
        int reverse = 0;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
