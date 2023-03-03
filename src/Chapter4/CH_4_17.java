package Chapter4;
/*
(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user
 */

import java.util.Scanner;

public class CH_4_17 {
    public static void main(String[] args) {

        //Scanner to get input from user
        Scanner input = new Scanner(System.in);

        int tripKilometers;
        double tripLiters = 0;
        double totalLiters = 0;
        int totalKilometers = 0;
        int recordCounter = 0;

        System.out.printf("How much kilometers per trip? %n(type -1 to quit)%n");
        tripKilometers = input.nextInt();

        if (tripKilometers != -1) {

            while ((tripKilometers != -1) && (tripLiters != -1)) {

                System.out.printf("Enter number of fuel consumed in liters %n(type -1 to quit)%n");
                tripLiters = input.nextDouble();

                if (tripLiters != -1) {

                    totalLiters = totalLiters + tripLiters;
                    totalKilometers = totalKilometers + tripKilometers;
                    recordCounter = recordCounter + 1;
                    double tripConsumption = (100 * tripLiters) / tripKilometers;

                    System.out.printf("Average consumption per trip is: %.2f%n", tripConsumption);

                    System.out.printf("How much kilometers per trip? %n(type -1 to quit)%n");
                    tripKilometers = input.nextInt();

                }
            }
        }
        if (recordCounter != 0) {
            double totalConsumption = (100 * totalLiters) / totalKilometers;

            System.out.printf("%n%n%nAverage consumption for all trips is %.2f%n", totalConsumption);
        } else System.out.println("No values were entered");
    }
}
