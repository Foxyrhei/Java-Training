// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import Chapter3.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", 25.50);

        //display balances
        displayAccount(account1);
        displayAccount(account2);

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter withdrawal amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nwithdrawal %.2f from account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount); // add to account1's balance

        // display balances
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter withdrawal amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nwithdrawal %.2f from account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        // display balances
        displayAccount(account1);
        displayAccount(account2);
    } // end main
    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());

    }
} // end class AccountTest

