package Chapter7;
/*
(Variable-Length Argument List) Write an application that calculates the product of a series
of integers that are passed to method product using a variable-length argument list.
Test your method with several calls, each with a different number of arguments.
 */

public class CH_7_14 {
    public static void main(String[] args) {
        System.out.println(Product(10, 15, 10));
        System.out.println(Product(1, 2, 3, 4, 5));
        System.out.println(Product(2, 4, 6, 8));
    }

    public static int Product(int... numbers) {
        int total = 1;
        for (int x : numbers)
            total *= x;
        return total;
    }
}
