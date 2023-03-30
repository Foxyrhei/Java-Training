package Chapter5;

/*
(Modified Compound-Interest Program) Modify the compound-interest application of
Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
vary the interest rate
 */
public class CH_5_14 {

    public static void main(String args[]) {
        double amount = 0; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate; // interest rate

        // display headers
        System.out.printf("%10s%16s%16s%16s%16s%16s%17ss%n", "Year", "Rate 5%", "Rate 6%", "Rate 7%", "Rate 8%", "Rate 9%", "Rate 10%");

        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; year++) {
            System.out.printf("%10d", year);
            for (rate = 0.05; rate <= 0.1; rate += 0.01) {
                // calculate new amount for specified year
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%16.2f", amount);
            }
            System.out.println();
        }
    }
}
