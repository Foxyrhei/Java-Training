package Chapter6;
/*
(Guess the Number Modification) Modify the program of Exercise 6.30 to count the number of guesses the player makes.
If the number is 10 or fewer, display Either you know the secret
or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret!
If the player makes more than 10 guesses, display You should be able to do better! Why should it
take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
half of the numbers, then half of the remaining numbers, and so on.
 */
import java.util.Scanner;
import java.security.SecureRandom;

public class CH_6_31 {

    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int generatedNumber = 1 + randomNumber.nextInt(1000);
        int numberOfGuesses = 1;

  //      System.out.printf("Generated number: %d%n", generatedNumber); // For debugging purpose

        System.out.printf("Guess a number between 1 and 1000:");

        while (input.hasNext()) {
            int number = input.nextInt();

            if (number > generatedNumber) {
                System.out.printf("Too high, try again!%n");
                numberOfGuesses++;
            } else if (number < generatedNumber) {
                System.out.printf("Too low, try again!%n");
                numberOfGuesses++;
            } else {
                System.out.printf("Congratulations. You guessed the number!!%n");
                displayResults(numberOfGuesses);
                break;
            }
        }
    }

    public static void displayResults(int numberOfGuesses) {
        if (numberOfGuesses < 10) {
            System.out.printf("Either you know the secret or you got lucky!");
        } else if (numberOfGuesses == 10) {
            System.out.printf("Either you know the secret or you got lucky!%nAha! You know the secret!");
        } else {
            System.out.printf(" You should be able to do better!");
        }
    }
}
