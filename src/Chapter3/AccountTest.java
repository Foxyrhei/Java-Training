// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
/*
(Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account.
Ensure that the withdrawal amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
(Fig. 3.9) to test method withdraw
 */
import Chapter3.Account;
/*
(Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account.
Ensure that the withdrawal amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
(Fig. 3.9) to test method withdraw
 */
import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args) 
   {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", 25.50);

      // display initial balance of each object
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter withdrawal amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nwithdrawal %.2f from account1 balance%n%n",
         depositAmount);
      account1.deposit(depositAmount); // add to account1's balance

      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 

      System.out.print("Enter withdrawal amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nwithdrawal %.2f from account2 balance%n%n",
         depositAmount);
      account2.deposit(depositAmount); // add to account2 balance

      // display balances
      System.out.printf("%s balance: $%.2f%n", 
         account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); 
   } // end main
} // end class AccountTest

