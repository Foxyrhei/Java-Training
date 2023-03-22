package Chapter5;
/*
(Bar Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks.
For example, if your program reads the number 7, it should display *******.
Display the bars of asterisks after you read all five numbers.
 */

import java.util.Scanner;

public class CH_5_16 {
    public static void main(String[] args) {
        int n = 1;
        int i;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter number between 1 and 30: %n");
        n = input.nextInt();

        if ((n >= 1) && (n <= 30)) {
            for (i = 1; i <= n; i++) {
                System.out.printf("*");
            }
            System.out.println("");
        } else
            System.out.printf("Invalid input. Please enter number between 1 and 30: %n");
        n = input.nextInt();
        if ((n >= 1) && (n <= 30)) {
            for (i = 1; i <= n; i++) {
                System.out.printf("*");
            }

        }
    }
}