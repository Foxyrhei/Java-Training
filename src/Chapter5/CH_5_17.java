package Chapter5;
/*
(Calculating Sales) An online retailer sells five products whose retail prices are as follows:
Product 1, $2.98;
product 2, $4.50;
product 3, $9.98;
product 4, $4.49 and
product 5, $6.87.
Write an application that reads a series of pairs of numbers as follows:
a) product number
b) quantity sold
Your program should use a switch statement to determine the retail price for each product. It
should calculate and display the total retail value of all products sold. Use a sentinel-controlled
loop to determine when the program should stop looping and display the final results
 */

import java.util.Scanner;

public class CH_5_17 {
    public static void main(String[] args) {


        int n, q;
        int totalCounter = 0;
        double total = 0;
        double aCount = 0;
        double bCount = 0;
        double cCount = 0;
        double dCount = 0;
        double fCount = 0;

        System.out.printf("Press Ctrl + D for exit%n");

        Scanner input = new Scanner(System.in);


        System.out.printf("Enter product number: %n");
        while (input.hasNext()) {
            n = input.nextInt();

            System.out.printf("Enter quantity: %n");
            q = input.nextInt();

            total = aCount + bCount + cCount + dCount + fCount;
            totalCounter++;

            switch (n) {
                case 1:
                    aCount = q * 2.98;
                    break;
                case 2:
                    bCount = q * 4.50;
                    break;
                case 3:
                    cCount = q * 9.98;
                    break;
                case 4:
                    dCount = q * 4.49;
                    break;
                case 5:
                    fCount = q * 6.87;
                    break;
                default:
                    System.out.printf("Incorrect product number%n");
            }
        }
        if (totalCounter != 0) {
            System.out.printf("Total sum is: %.2f", total);
        }
    }
}
