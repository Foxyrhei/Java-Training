package Chapter5;
/*
(Bar Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks.
For example, if your program reads the number 7, it should display *******.
 */

import java.util.Scanner;

public class CH_5_16 {
    public static void main(String[] args) {

        int i; //Counter for 5 iterations
        int j; //counter for asterisks iteration
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter number between 1 and 30: %n");

        for (i = 1; i <= 5; i++) {

            int n = input.nextInt();

            while (n < 1 || n > 30) {
                System.out.printf("Enter number between 1 and 30: %n");
                n = input.nextInt();
            }
            for (j = 1; j <= n; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}