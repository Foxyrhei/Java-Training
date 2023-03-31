package Chapter6;
/*
(Displaying a Square of Any Character)
Modify the method created in Exercise 6.18 to receive a second parameter of type char called fillCharacter.
Form the square using the char provided as an argument. Thus, if side is 5 and fillCharacter is #, the method should display
#####
#####
#####
#####
#####
Use the following statement (in which input is a Scanner object) to read a character from the user
at the keyboard:
char fill = input.next().charAt(0);
 */

import java.util.Scanner;

public class CH_6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter integer: ");
        int a = input.nextInt();

        System.out.printf("Enter symbol: ");
        char fill = input.next().charAt(0);

        squareOfAsterisks(a, fill);

    }

    public static void squareOfAsterisks(int a, char fill) {
        for (int j = 1; j <= a; j++) {
            for (int i = 1; i <= a; i++) {
                System.out.printf("%c ", fill);
            }
            System.out.println();
        }
    }
}
