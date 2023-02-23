package Chapter3;
/*
(Date Class) Create a class called Date that includes three instance variables
a month (type int),
a day (type int) and
a year (type int).
Provide a constructor that initializes the three instance
variables and assumes that the values provided are correct.
Provide a set and a get method for each instance variable.
Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
Write a test app named DateTest that demonstrates class Date’s capabilities.
 */
import java.util.Scanner;
public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day: "); // prompt
        Integer day  = input.nextInt(); // obtain user input

        System.out.println("Enter a month: "); // prompt
        Integer month = input.nextInt(); // obtain user input

        System.out.println("Enter a year: "); // prompt
        Integer year = input.nextInt(); // obtain user input

        Date testDate = new Date(day, month, year);
        testDate.displayDate();

    }

}
