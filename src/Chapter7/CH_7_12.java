package Chapter7;
/*
(Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
in which all five numbers are different. Use the smallest possible array to solve this problem. Display
the complete set of unique values input after the user enters each new value

во вложенном цикле тебе нужно реализовать следующую логику - прогоняешь по всем и проверяешь если совпадает с каким-то.
результат совпадения храни типа boolean, то есть если есть совпадение - типа true.
потом проверь этот флаг и если он false - то вводимое значение помещаешь в массив и только тогда делаешь i++
 */

import java.util.Scanner;

public class CH_7_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5]; // create an array to store the unique numbers
        int count = 0; // keep track of how many unique numbers have been entered

        System.out.print("Enter a number between 10 and 100: ");
        int number = input.nextInt();

        // loop through the remaining numbers and check for duplicates
        while (count < 5) {
            boolean duplicate = false;

            // check if the number is already in the array
            for (int i = 0; i < count; i++) {
                if (array[i] == number) {
                    duplicate = true;
                    break;
                }
            }

            // if the number is not a duplicate, add it to the array and display it
            if (!duplicate) {
                array[count] = number;
                count++;
                System.out.print("Unique numbers entered so far: ");
                for (int i = 0; i < count; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }

            // prompt the user to enter another number
            System.out.print("Enter another number between 10 and 100: ");
            number = input.nextInt();
        }
    }
}




