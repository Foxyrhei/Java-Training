package Chapter5;

/*
(Calculating the Product of Odd Integers) Write an application that calculates the product
of the odd integers from 1 to 15.
 */
public class CH_5_12 {
    public static void main(String[] args) {
        int product = 1;

        for (int number = 1; number < 16; number += 2)
            product = product * number;

        System.out.printf("Product of the odd integers: %d%n", product);
    }
}
