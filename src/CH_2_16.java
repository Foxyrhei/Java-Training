

/*
(Comparing Integers) Write an application that asks the user to enter two integers, obtains
them from the user and displays the larger number followed by the words "is larger".
If the numbers are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.
 */
import java.util.Scanner;
public class CH_2_16 {
    public static void main(String[] args)
    {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; // first number to add
        int number2; // second number to add

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        if (number1 == number2)
            System.out.print("These numbers are equal"); // Equal numbers

        if (number1 < number2) // Second number is larger
            System.out.printf("%s%s",
                    number2, "\tis larger"); // Pretty sure there should be a better way to put variable before text

        if (number1 > number2) // First number is larger
            System.out.printf("%s%s",
                    number1, "\tis larger");

    }
}
