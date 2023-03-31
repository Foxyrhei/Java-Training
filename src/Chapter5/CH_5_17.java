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
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter product number (1-5) or -1 to Quit: %n");
        n = input.nextInt();

        while (n != -1) {

            System.out.printf("Enter quantity: %n");
            q = input.nextInt();

            switch (n) {
                case 1:
                    total = total + (q * 2.98);
                    break;
                case 2:
                    total = total + (q * 4.50);
                    break;
                case 3:
                    total = total + (q * 9.98);
                    break;
                case 4:
                    total = total + (q * 4.49);
                    break;
                case 5:
                    total = total + (q * 6.87);
                    break;
                default:
                    System.out.printf("Incorrect product number%n");
            }
            System.out.printf("Enter product number (1-5) or -1 to Quit: %n");
            n = input.nextInt();
        }
        System.out.printf("Total sum is: %.2f", total);
    }
}
