package Chapter6;
/*
(Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
the coin appears. Display the results. The program should call a separate method flip that takes no
arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
simulates coin tossing, each side of the coin should appear approximately half the time.]
 */

import java.security.SecureRandom;

public class CH_6_29 {
    public static void main(String[] args) {
        flip();
    }


    public static void flip() {
        SecureRandom randomFlips = new SecureRandom();
        int heads = 0;
        int tails = 0;
        for (int flip = 1; flip <= 5000; flip++) {
            int face = 1 + randomFlips.nextInt(2);
            switch (face) {
                case 1:
                    ++heads;
                    break;
                case 2:
                    ++tails;
                    break;
            }
        }
        System.out.println("Face Frequency");
        System.out.printf("1\t%d%n2\t%d", heads, tails);
    }
}
