package week_05.exercise_017_04;

import java.util.UUID;

public class BankAccount implements BankOperations{
    private String accountNumber;
    private String accountType;
    private double balance = 0.0;

    public BankAccount() {
        this.accountNumber = UUID.randomUUID().toString().substring(0,6);
        this.accountType = "Bank account";
        this.balance = 0.0;
    }

    private String getAccountNumber() {
        return accountNumber;
    }

    protected void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private String getAccountType() {
        return accountType;
    }

    protected void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    private double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawMoney(double amount) {
        System.out.println("Withdrawing " + amount + " simoleons...");
        if(amount >= 0){
            if(getBalance() > amount) {
                setBalance(getBalance() - amount);
            } else {
                System.out.println("The amount you tried to withdraw exceeded the balance");
            }
        } else {
            System.out.println("You cannot withdraw a negative value");
        }
    }

    public void depositMoney(double amount) {
        System.out.println("Depositing " + amount + " simoleons...");
        if(amount > 0){
            setBalance(balance + amount);
            System.out.println("You deposited " + amount + ". The account balance is now: " + getBalance());
        } else{
            System.out.println("The value is invalid");
        }

    }

    public String toString(){
        return accountType + " #" + accountNumber + " has a balance of " + balance + " simoleons.";
    }
}
