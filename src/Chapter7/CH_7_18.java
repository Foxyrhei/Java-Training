package Chapter7;
/*
(Game of Craps) Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
answers the following questions:
a) How many games are won on the first roll, second roll, …, twentieth roll and after the
twentieth roll?
b) How many games are lost on the first roll, second roll, …, twentieth roll and after the
twentieth roll?
c) What are the chances of winning at craps? [Note: You should discover that craps is one
of the fairest casino games. What do you suppose this means?]
d) What is the average length of a game of craps?
e) Do the chances of winning improve with the length of the game?
 */

import java.security.SecureRandom;

public class CH_7_18 {
    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST}

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // plays one game of craps
    public static void main(String[] args) {

        int[] array1 = new int[22];
        int[] array2 = new int[22];
        double product = 0;
        double total1 = 0;
        double total2 = 0;
        double pass = 0;

        Status gameStatus; // can contain CONTINUE, WON or LOST
        for (int counter = 1; counter <= 1000000; counter++) {
            int myPoint = 0; // point if no win or loss on first roll
            int count = 1;
            int sumOfDice = rollDice(); // first roll of the dice

            // determine game status and point based on first roll
            switch (sumOfDice) {
                case SEVEN: // win with 7 on first roll
                case YO_LEVEN: // win with 11 on first roll
                    gameStatus = Status.WON;
                    ++array1[1];
                    ++pass;
                    break;
                case SNAKE_EYES: // lose with 2 on first roll
                case TREY: // lose with 3 on first roll
                case BOX_CARS: // lose with 12 on first roll
                    gameStatus = Status.LOST;
                    ++array2[1];
                    break;
                default: // did not win or lose, so remember point
                    gameStatus = Status.CONTINUE; // game is not over
                    myPoint = sumOfDice; // remember the point
                    break;
            }

            // while game is not complete
            while (gameStatus == Status.CONTINUE) // not WON or LOST
            {
                ++count;
                sumOfDice = rollDice(); // roll dice again

                // determine game status
                if (sumOfDice == myPoint) {
                    if (count > 20)
                        ++array2[21];
                    else
                        ++array1[count];
                    ++pass;
                    gameStatus = Status.WON; // win by making point
                    break;
                    //This part of the code is within a while loop that runs while the game status is "CONTINUE" and the player has not yet won or lost the game.
                    //
                    //In this block of code, the variable count keeps track of the number of rolls that have been made after the first roll. The first roll has already been handled earlier in the code.
                    //
                    //The if statement checks if the current roll is greater than 20. If it is, it means that the game has gone on for too long and the player has not won, so the game is counted as a loss and array2[21] is incremented. array2[21] represents the number of games that were lost after 20 rolls.
                    //
                    //If the current roll is less than or equal to 20, it means that the game is still ongoing and the current roll count is used to index array1, which represents the number of games won for each number of rolls. array1[count] is incremented to indicate that the player has won after count rolls.
                    //
                    //Finally, the pass variable is incremented to keep track of the number of times the player has won.
                } else if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                    if (count > 20)
                        ++array2[21];
                    else
                        ++array2[count];
                    gameStatus = Status.LOST;
                    break;
                }
            }
        }
            System.out.printf("%s%10s%10s\n", "Roll", "Wins", "Loss");

            for (int roll = 1; roll <= 21; roll++) {

                System.out.printf("%4d%10d%10d\n", roll, array1[roll], array2[roll]);

                product += roll * (array1[roll] + array2[roll]);
                total1 += array1[roll];
                total2 += array2[roll];
                //This part of the code is a for loop that iterates through the array1 and array2 arrays, which are used to keep track of the number of wins and losses for each roll of the dice.
                //
                //For each iteration of the loop, it prints the value of the loop variable roll, which represents the number rolled on the dice, followed by the number of wins and losses for that roll, which are stored in the array1 and array2 arrays respectively.
                //
                //It then calculates the product of the current roll and the total number of wins and losses for that roll, and adds it to the product variable. It also adds the number of wins and losses for that roll to the total1 and total2 variables respectively.
            }
            System.out.printf("Average length of a game of craps(mean): %.1f\n",
                    product / (total1 + total2));

            System.out.printf("Chances of winning: %.2f percent\n", (total1 / 1000000) * 100);

    }

    // roll dice, calculate sum and display results
    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        return die1 + die2;
    }

}
