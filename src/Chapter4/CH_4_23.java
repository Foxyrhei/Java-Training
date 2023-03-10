package Chapter4;
/*
(Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.]
 */
import java.util.Scanner;
public class CH_4_23 {
    public static void main(String[] args) {

        int inputCounter = 1;
        int number = 0;
        int max1st = 0;
        int max2nd = 0;

        Scanner input = new Scanner(System.in);

        while (inputCounter <= 10) {
            System.out.printf("Enter number%n");
            number = input.nextInt();
            if (number >= max1st && number >= max2nd) {
                max1st = number;
            }
            if (number >= max2nd && number < max1st){
                max2nd = number;
            }
            inputCounter++;
        }
        System.out.printf("Largest number is: %d%n", max1st);
        System.out.printf("Second largest number is: %d", max2nd);
    }
}
