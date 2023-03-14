package Chapter4;

/*
(Checkerboard Pattern of Asterisks) Write an application that uses only the output statements
System.out.print("* ");
System.out.print(" ");
System.out.println();
to display the checkerboard pattern that follows. A System.out.println method call with no arguments
causes the program to output a single newline character. [Hint: Repetition statements are
required.]

 */
public class CH_4_32 {
    public static void main(String[] args) {
        int columnCounter = 1;
        int rowCounter = 1;

        while (rowCounter < 5) {
            for (columnCounter = 1; columnCounter <= 8; columnCounter++) {
                System.out.print("* ");
                System.out.print(" ");
            }
            System.out.println();
            for (columnCounter = 1; columnCounter <= 8; columnCounter++) {
                System.out.print(" ");
                System.out.print("* ");
            }
            rowCounter++;
            System.out.println();
        }
    }
}

