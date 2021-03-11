package week_05.exercise_017_04;

import java.util.UUID;

public class SavingAccount extends BankAccount{
    public SavingAccount() {
        this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
        this.setAccountType("Saving account");
        this.setBalance(0.0);
    }
}
