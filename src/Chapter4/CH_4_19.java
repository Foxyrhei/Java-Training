package Chapter4;

import java.util.Scanner;

/*
(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item    Value
1       239.99
2       129.75
3       99.95
4       350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
 */
public class CH_4_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalPrice = 0;
        double itemPrice = 0; //price per item
        int itemCounter = 1;


        if (itemPrice != -1)  // Exit on entering -1
        {
            while (itemPrice != -1) {
                System.out.printf("Enter sold item value: %n(type -1 to quit)%n");
                itemPrice = input.nextDouble();
                totalPrice = totalPrice + itemPrice;
                itemCounter++;
                double weeklyComission = (totalPrice * 0.09) + 200;

                System.out.printf("Salesperson earnings for a week are %.2f%n", weeklyComission);
            }
        }
    }
}

