package Chapter5;

/*
(Modified Compound-Interest Program) Modify the compound-interest application of
Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
vary the interest rate
 */
public class CH_5_14 {

    public static void main(String args[]) {
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate; // interest rate

        // display headers
        System.out.printf("%s\t%s%20s%n", "Year", "Rate", "Amount on deposit");

        for (rate = 0.05; rate <= 0.1; rate += 0.01) {

            // calculate amount on deposit for each of ten years
            for (int year = 1; year <= 10; year++) {
                // calculate new amount for specified year
                amount = principal * Math.pow(1.0 + rate, year);

                // display the year and the amount
                System.out.printf("%d\t\t%.2f\t\t%.2f%n", year, rate, amount);
            }
        }
    }

}
