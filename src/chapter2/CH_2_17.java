package chapter2;/*
(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers.
Use the techniques
shown in Fig. 2.15.
[Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]
 */

import java.util.Scanner;

public class CH_2_17 {
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; // first number to add
        int number2; // second number to add
        int number3; // third number to add
        int sum; // sum of 3 numbers
        int product; // product of three numbers
        int average; // average of three numbers

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        System.out.print("Enter third integer: "); // prompt
        number3 = input.nextInt(); // read third number from user

        sum = number1 + number2 + number3; // add numbers, then store total in sum
        product = number1 * number2 * number3; // product numbers, then store result in product
        average = (number1 + number2 + number3) / 3; // average numbers, then store result in average

        System.out.printf("Sum is %d%n", sum); // display sum
        System.out.printf("Product is %d%n", product); // display product
        System.out.printf("Average is %d%n", average); // display average

        //Copy-paste solution from codevscolor.com method by using separate variables
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        System.out.println(smallest + " is the smallest number.");
        System.out.println(largest + " is the largest number.");

    }
}
