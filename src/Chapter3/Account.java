package Chapter3;// Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

/*
(Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account.
Ensure that the withdrawal amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
(Fig. 3.9) to test method withdraw
 */

public class Account
{   
   private String name; // instance variable 
   private double balance; // instance variable 

   // Account constructor that receives two parameters  
   public Account(String name, double balance) 
   {
      this.name = name; // assign name to instance variable name

      // validate that the balance is greater than 0.0; if it's not,
      // instance variable balance keeps its default initial value of 0.0
      if (balance > 0.0) // if the balance is valid
         this.balance = balance; // assign it to instance variable balance
   }


   // debit (subtract)an amount to the account
   public void deposit(double depositAmount)
   {
      if (depositAmount > balance)
         System.out.println("Debit amount exceeded account balance\n");
      else
         balance=balance-depositAmount;
   }

   // method returns the account balance
   public double getBalance()
   {
      return balance; 
   } 

   // method that sets the name
   public void setName(String name)
   {
      this.name = name; 
   } 

   // method that returns the name
   public String getName()
   {
      return name; 
   } 
} // end class Account

