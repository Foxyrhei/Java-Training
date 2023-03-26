package Chapter6;
/*
(Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
whether an integer is even. The method should take an integer argument and return true if the integer is even and false otherwise.
Incorporate this method into an application that inputs a sequence of integers (one at a time) and determines whether each is even or odd.
 */

import java.util.Scanner;

public class CH_6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter integer: ");
        int a = input.nextInt();

        if (isEven(a)) {
            System.out.printf("Integer is even");
        } else {
            System.out.printf("Integer is odd");
        }
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
