package Chapter4;
/*
(Sides of a Right Triangle)
Write an application that reads three nonzero integers and determines and prints whether they could represent the sides of a right triangle
 */
import java.util.Scanner;
public class CH_4_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sideA;
        int sideB;
        int sideC;

        System.out.printf("Enter first side of triangle: %n");
        sideA = input.nextInt();

        System.out.printf("Enter second side of triangle: %n");
        sideB = input.nextInt();

        System.out.printf("Enter third side of triangle: %n");
        sideC = input.nextInt();

        if ((sideA > 0) && (sideB > 0) && (sideC > 0)) {
            //All 3 sides should be equal in right triangle
            if ((sideA == sideB) && (sideB == sideC)) {
                System.out.printf("Values can represent the sides of a right triangle");
            } else {
                System.out.printf("Values can not represent the sides of a right triangle");
            }
        } else {
            System.out.printf("Please enter positive values");
        }
    }
}
