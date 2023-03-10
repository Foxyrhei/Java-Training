package Chapter4;
/*
(Square of Asterisks) Write an application that prompts the user to enter the size of the side
of a square, then displays a hollow square of that size made of asterisks. Your program should work
for squares of all side lengths between 1 and 20.
 */
import java.util.Scanner;
public class CH_4_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int columnCount = 1;
        int rowCount = 1;

        System.out.printf("Enter square size: %n");
        int n = input.nextInt();

        for(columnCount = 1; columnCount <= n; columnCount++){
            for(rowCount = 1; rowCount <= n; rowCount++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
