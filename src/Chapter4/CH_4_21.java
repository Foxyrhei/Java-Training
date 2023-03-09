package Chapter4;
/*
(Find the Largest Number) The process of finding the largest value is used frequently in computer applications.
For example, a program that determines the winner of a sales contest would input
the number of units sold by each salesperson. The salesperson who sells the most units wins the contest.
Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines and prints the largest integer.
Your program should use at least the following three variables:
a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
input and to determine when all 10 numbers have been processed).
b) number: The integer most recently input by the user.
c) largest: The largest number found so far.

Pseudocode:

Set inputCounter to 1
Set number to 0

While inputCounter is less or equal to ten

    Prompt user to enter variable
    if entered number is larger than previous one
        assign number as largest
    else
        keep largest unchanged
    Add one to the inputCounter

Print largest number

 */

import java.util.Scanner;

public class CH_4_21 {
    public static void main(String[] args) {
        int inputCounter = 1;
        int number = 0;
        int largest = 0;

        Scanner input = new Scanner(System.in);

        while (inputCounter <= 10) {
            System.out.printf("Enter number%n");
            number = input.nextInt();
            if (number > largest) {
                largest = number;
            }
            largest = largest;
            inputCounter++;
        }
        System.out.printf("Largest number is: %d", largest);
    }
}
