package Chapter4;
/*
(Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611.
Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
If the number is not five digits long, display an error message and allow the user to enter
a new value.
 */

//Don't know how to correctly show messages for not palindrome

import java.util.Scanner;

public class CH_4_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.printf("Enter 5-digit palindrome:%n");
        int number = input.nextInt();
        int n = number;

//Counting number of digits in number
        while (number != 0) {
            number = number / 10;
            ++count;
        }
        //If the number is not five digits long, display an error message and allow the user to enter
        //a new value.
        if (count != 5) {
            System.out.printf("Enter 5-digit number%n");
            number = input.nextInt();
        } else {
            // Find the appropriate divisor
            // to extract the leading digit
            int divisor = 1;
            while (n / divisor >= 10)
                divisor *= 10;

            while (n != 0) {
                int leading = n / divisor;
                int trailing = n % 10;

                // If first and last digit
                // not same return false
                if (leading != trailing) {
                    System.out.printf("Not palindrome");
                    break;
                }
                // Removing the leading and trailing
                // digit from number
                n = (n % divisor) / 10;

                // Reducing divisor by a factor
                // of 2 as 2 digits are dropped
                divisor = divisor / 100;
                if (n == 0) {System.out.printf("Palindrome");}
            }
            //System.out.printf("Palindrome");
        }

    }
}
