package Chapter5;
/*
(Find the Smallest Value) Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user.
 */

import java.util.Scanner;

public class CH_5_11 {
    public static void main(String[] args) {

        int n;
        int number = 0;
        int min = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter number of values to be compared: %n");
        n = input.nextInt();

        for (int counter = 1; counter < n; counter++) {
            System.out.printf("Enter value: %n");
            number = input.nextInt();

            if (min > number) {
                min = number;
            }
        }
        System.out.printf("Lowest number is: %d", min);

    }
}
