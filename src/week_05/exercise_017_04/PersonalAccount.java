package week_05.exercise_017_04;

import java.util.UUID;

public class PersonalAccount extends BankAccount{
    public PersonalAccount() {
        this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
        this.setAccountType("Personal account");
        this.setBalance(0.0);
    }
}
