package Chapter4;
/*
(Credit Limit Calculator) Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers,
calculate the new balance (= beginning balance + charges – credits),
display the new balance and determine whether the new balance exceeds the customer’s credit limit.
For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
 */

public class CreditLimitCalc {

    private int accountNumber;
    private int balance;
    private int allItems;
    private int allCredits;
    private int creditLimit;

    //Constructor
    public CreditLimitCalc(int accountNumber, int balance, int allItems, int allCredits, int creditLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.allItems = allItems;
        this.allCredits = allCredits;
        this.creditLimit = creditLimit;
    }

public double displayInfo(){
        double newBalance = (getBalance()+getAllItems()-getAllCredits());
                System.out.printf("Account new balance is: %.2f%n",newBalance);
        if (newBalance < 0){
            System.out.println("Credit limit exceeded");
        }
        return newBalance;
}

    // Set methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAllItems(int allItems) {
        this.allItems = allItems;
    }

    public void setAllCredits(int allCredits) {
        this.allCredits = allCredits;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    //Get methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getAllItems() {
        return allItems;
    }

    public int getAllCredits() {
        return allCredits;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
