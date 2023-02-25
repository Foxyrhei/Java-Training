package Chapter3;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First name: "); // prompt
        String firstname = input.next(); // obtain user input

        System.out.println("Enter Last name: "); // prompt
        String lastname = input.next(); // obtain user input

        System.out.println("Enter gender: "); // prompt
        String gender = input.next(); // obtain user input

        System.out.println("Enter a day: "); // prompt
        Integer day = input.nextInt(); // obtain user input

        System.out.println("Enter a month: "); // prompt
        Integer month = input.nextInt(); // obtain user input

        System.out.println("Enter a year: "); // prompt
        Integer year = input.nextInt(); // obtain user input

        System.out.println("Enter height: "); // prompt
        double height = input.nextDouble(); // obtain user input

        System.out.println("Enter weight: "); // prompt
        double weight = input.nextDouble(); // obtain user input

        HealthProfile testHealthProfile = new HealthProfile(firstname, lastname, gender, day, month, year, height, weight);
        testHealthProfile.displayData();

    }
}
