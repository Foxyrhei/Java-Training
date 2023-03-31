package Chapter6;
/*
(Guess the Number) Write an application that plays “guess the number” as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number!, and allow the user to choose whether to play again.
[Note: The guessing technique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
Searching, Sorting and Big O.]
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class CH_6_30 {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int generatedNumber = 1 + randomNumber.nextInt(1000);

   //    System.out.printf("Generated number: %d%n", generatedNumber); // For debugging purpose

        System.out.printf("Guess a number between 1 and 1000:");

        while (input.hasNext()) {
            int number = input.nextInt();

            if (number > generatedNumber) {
                System.out.printf("Too high, try again!%n");
            } else if (number < generatedNumber) {
                System.out.printf("Too low, try again!%n");
            } else {
                System.out.printf("Congratulations. You guessed the number!!");
                break;
            }
        }
    }

}

