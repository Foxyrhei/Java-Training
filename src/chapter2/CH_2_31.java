package chapter2;

/*
(Table of Squares and Cubes) Using only the programming techniques you learned in this
chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
prints the resulting values in table format, as shown below.
number square cube
0       0       0
1       1       1
2       4       8
3       9       27
4       16      64
5       25      125
6       36      216
7       49      343
8       64      512
9       81      729
10      100     1000
 */
public class CH_2_31 {
    public static void main(String[] args) {

        String heading1 = "Number";
        String heading2 = "Square";
        String heading3 = "Cube";

        int number0 = 0;
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int number6 = 6;
        int number7 = 7;
        int number8 = 8;
        int number9 = 9;
        int number10 = 10;

        int square0 = number0 * number0;
        int square1 = number1 * number1;
        int square2 = number2 * number2;
        int square3 = number3 * number3;
        int square4 = number4 * number4;
        int square5 = number5 * number5;
        int square6 = number6 * number6;
        int square7 = number7 * number7;
        int square8 = number8 * number8;
        int square9 = number9 * number9;
        int square10 = number10 * number10;

        int cube0 = number0 * number0 * number0;
        int cube1 = number1 * number1 * number1;
        int cube2 = number2 * number2 * number2;
        int cube3 = number3 * number3 * number3;
        int cube4 = number4 * number4 * number4;
        int cube5 = number5 * number5 * number5;
        int cube6 = number6 * number6 * number6;
        int cube7 = number7 * number7 * number7;
        int cube8 = number8 * number8 * number8;
        int cube9 = number9 * number9 * number9;
        int cube10 = number10 * number10 * number10;

        System.out.printf("%s %s %s %n", heading1, heading2, heading3);
        System.out.printf("%d %7d %7d %n", number0, square0, cube0);
        System.out.printf("%d %7d %7d %n", number1, square1, cube1);
        System.out.printf("%d %7d %7d %n", number2, square2, cube2);
        System.out.printf("%d %7d %8d %n", number3, square3, cube3);
        System.out.printf("%d %8d %7d %n", number4, square4, cube4);
        System.out.printf("%d %8d %8d %n", number5, square5, cube5);
        System.out.printf("%d %8d %8d %n", number6, square6, cube6);
        System.out.printf("%d %8d %8d %n", number7, square7, cube7);
        System.out.printf("%d %8d %8d %n", number8, square8, cube8);
        System.out.printf("%d %8d %8d %n", number9, square9, cube9);
        System.out.printf("%d %8d %8d %n", number10, square10, cube10);

    }
}
