package Chapter6;
/*
(Separating Digits) Write methods that accomplish each of the following tasks:
a) Calculate the integer part of the quotient when integer a is divided by integer b.
b) Calculate the integer remainder when integer a is divided by integer b.
c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
each pair of digits by two spaces. For example, the integer 4562 should appear as
4 5 6 2
Incorporate the methods into an application that inputs an integer and calls displayDigits by passing the method the integer entered. Display the results.
 */

import java.util.Scanner;

public class CH_6_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter first integer: ");
        int a = input.nextInt();

        System.out.printf("Enter second integer: ");
        int b = input.nextInt();

        System.out.printf("Enter an integer between 1 and 99999: ");
        int c = input.nextInt();

        System.out.printf("The quotient when integer a is divided by integer b: %d%n", quotient(a, b));
        System.out.printf("The integer remainder when integer a is divided by integer b: %d%n", remainder(a, b));
        displayDigits(c);
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;

    }

    public static void displayDigits(int c) {
        int number1 = c / 10000;
        int arrange = c % 10000;
        int number2 = arrange / 1000;
        int number3 = (arrange % 1000) / 100;
        int number4 = ((arrange % 1000) % 100) / 10;
        int number5 = ((arrange % 1000) % 100) % 10;

        System.out.printf("%d %d %d %d %d", number1, number2, number3, number4, number5);
    }
}
