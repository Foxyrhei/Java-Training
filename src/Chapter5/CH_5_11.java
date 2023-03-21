package Chapter5;
/*
(Find the Smallest Value) Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user.
 */

import java.util.Scanner;

public class CH_5_11 {
    public static void main(String[] args) {

        int n;
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter number of values to be compared: %n");
        n = input.nextInt();

        for (int counter = 1; counter <= n; counter++) {
            System.out.printf("Enter value: %n");
            number = input.nextInt();
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

        }
        System.out.printf("Smallest number is: %d", +min);

    }
}
