package Chapter5;

import java.math.BigInteger;

/*
(Factorials) Factorials are used frequently in probability problems. The factorial of a positive
integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
1 to n. Write an application that calculates the factorials of 1 through 20. Use type long. Display the
results in tabular format. What difficulty might prevent you from calculating the factorial of 100?
 */
public class CH_5_13 {
    public static void main(String[] args) {

        int i; //counter for factorial
        BigInteger fact = new BigInteger("1");

        for (i = 1; i <= 60; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println("Factorial of "
                    + i + " is:\n" + fact);
        }
    }
}
