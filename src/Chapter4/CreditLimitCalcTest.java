package Chapter4;

import Chapter3.Invoice;

import java.util.Scanner;

public class CreditLimitCalcTest {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int recordCounter = 1;


        while (recordCounter <= 3) {
            System.out.print("Enter account number: "); // prompt
            int getAccountNumber = input.nextInt(); // obtain user input
            System.out.print("Enter balance at the beginning of the month: "); // prompt
            int getBalance = input.nextInt(); // obtain user input
            System.out.print("Enter total of all items charged by the customer this month: "); // prompt
            int getAllItems = input.nextInt(); // obtain user input
            System.out.print("Enter total of all credits applied to the customer’s account this month: "); // prompt
            int getAllCredits = input.nextInt(); // obtain user input
            System.out.print("Enter allowed credit limit: "); // prompt
            int getCreditLimit = input.nextInt(); // obtain user input

            CreditLimitCalc testCreditLimitCalc = new CreditLimitCalc(getAccountNumber,getBalance,getAllItems,getAllCredits,getCreditLimit);

            System.out.println(getAccountNumber);
            System.out.println(getBalance);
            System.out.println(getAllItems);
            System.out.println(getAllCredits);
            System.out.println(getCreditLimit);
            System.out.println(testCreditLimitCalc.displayInfo());
            recordCounter++;
        }

    }
}
