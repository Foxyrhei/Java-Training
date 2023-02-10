package chapter2;
/*
(Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user,
separates the number into its individual digits and prints the digits
separated from one another by three spaces each.
For example, if the user types in the number 42339, the program should print
4 2 3 3 9
Assume that the user enters the correct number of digits. What happens when you enter a
number with more than five digits? What happens when you enter a number with fewer than five
digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
need to use both division and remainder operations to “pick off” each digit.]
 */

import java.util.Scanner;

public class CH_2_30 {
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number; // Integer input from user

        System.out.print("Enter 5-digit integer: "); // specified prompt for user
        number = input.nextInt(); // read number from user

        int number1 = number / 10000;
        int arrange = number % 10000;
        int number2 = arrange / 1000;
        int number3 = (arrange % 1000) / 100;
        int number4 = ((arrange % 1000) % 100) / 10;
        int number5 = ((arrange % 1000) % 100) % 10;

        System.out.printf("%d %d %d %d %d", number1, number2, number3, number4, number5);

    }
}
