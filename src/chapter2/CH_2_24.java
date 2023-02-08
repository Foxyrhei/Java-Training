package chapter2;/*
(Largest and Smallest Integers) Write an application that reads five integers and determines
and prints the largest and smallest integers in the group. Use only the programming techniques you
learned in this chapter.
 */
import java.util.Scanner;
public class CH_2_24 {
    public static void main(String[] args)
    {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; // first number to add
        int number2; // second number to add
        int number3; // third number to add
        int number4; // fourth number to add
        int number5; // fifth number to add

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        System.out.print("Enter third integer: "); // prompt
        number3 = input.nextInt(); // read third number from user

        System.out.print("Enter foгrth integer: "); // prompt
        number4 = input.nextInt(); // read fourth number from user

        System.out.print("Enter fifth integer: "); // prompt
        number5 = input.nextInt(); // read fifth number from user

        // setting 1-st number as smallest and largest and comparing each number with it. If condition is true, then new number is assigned as smallest / largest
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number4 < smallest) {
            smallest = number4;

        }if (number5 < smallest) {
        smallest = number5;
    }
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        if (number4 > largest) {
            largest = number4;
        }
        if (number5 > largest) {
            largest = number5;
        }

        System.out.println(smallest + " is the smallest number.");
        System.out.println(largest + " is the largest number.");

    }
}
