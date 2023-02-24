package Chapter3;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First name: "); // prompt
        String firstname = input.next(); // obtain user input

        System.out.println("Enter Last name: "); // prompt
        String lastname = input.next(); // obtain user input

        System.out.println("Enter a day: "); // prompt
        Integer day = input.nextInt(); // obtain user input

        System.out.println("Enter a month: "); // prompt
        Integer month = input.nextInt(); // obtain user input

        System.out.println("Enter a year: "); // prompt
        Integer year = input.nextInt(); // obtain user input

        HeartRates testHeartRates = new HeartRates(firstname, lastname, day, month, year);
        testHeartRates.displayData();

    }
}
