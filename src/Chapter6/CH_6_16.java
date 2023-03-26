package Chapter6;
/*
(Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
second integer is a multiple of the first. The method should take two integer arguments and return
true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
time) and determines whether the second value in each pair is a multiple of the first.
 */

import java.util.Scanner;

public class CH_6_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter first integer: ");
        int a = input.nextInt();

        System.out.printf("Enter second integer: ");
        int b = input.nextInt();

        if (isMultiple(a, b)) {
            System.out.println(b + " is a multiple of " + a);
        } else {
            System.out.println(b + " is not a multiple of " + a);
        }
    }

    public static boolean isMultiple(int a, int b) {
        if (b % a == 0) {
            return true;
        } else {
            return false;
        }
    }

}

