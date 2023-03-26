package Chapter6;
/*
(Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
square (the same number of rows and columns) of asterisks whose side is specified in integer parameter side. For example, if side is 4, the method should display
****
****
****
****
Incorporate this method into an application that reads an integer value for side from the user and
outputs the asterisks with the squareOfAsterisks method.
 */

import java.util.Scanner;

public class CH_6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter integer: ");
        int a = input.nextInt();
        squareOfAsterisks(a);

    }

    public static void squareOfAsterisks(int a) {
        for (int j = 1; j <= a; j++) {
            for (int i = 1; i <= a; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
