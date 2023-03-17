package Chapter4;
/*
Factorial
1) Write an application that reads a nonnegative integer and computes and prints its factorial.
2) Write an application that estimates the value of the mathematical constant e by using
the following formula. Allow the user to enter the number of terms to calculate.
 */

import java.util.Scanner;

public class CH_4_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int i; //counter for factorial
        int fact = 1;

        System.out.printf("Enter nonnegative integer: %n");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.printf("Factorial is: %d%n", fact);

        //Problem solved by ChatGPT-3
        //In this program, we first prompt the user to enter the number of terms to calculate,
        // and then we initialize the value of e to 1.
        // We also initialize a variable to keep track of the factorial of the current term.
        //Next, we use a for loop to iterate over the number of terms specified by the user.
        // For each term, we update the value of the factorial and add the corresponding fraction to the value of e.
        //Finally, we output the estimated value of e to the console.
        System.out.print("Enter the number of terms to calculate: ");
        int j = input.nextInt();

        double e = 1;
        double term = 1;
        for (int m = 1; m <= j; m++) {
            term /= m;
            e += term;
        }

        System.out.println("The estimated value of e is: " + e);
////
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter the number of terms to calculate: ");
        n = input.nextInt();

        double result = 1;
        term = 1;
        for (i = 1; i <= n; i++) {
            term *= x / i;
            result += term;
        }
        System.out.println("e^" + x + " = " + result);
    }
}
