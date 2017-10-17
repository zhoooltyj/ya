package homework.hwtwo.account;

/**
 * Created by polosatik on 25.09.17.
 */
public class Account {
    int balance;
    int overdraft;

    public Account() {
        balance=0;
    }

    public Account(int balance) throws NotSufficientAmountException {
        if (balance < 0) throw new NotSufficientAmountException();
        this.balance = balance;
    }

    public Account(int balance, int overdraft) throws NotSufficientAmountException {
        if (overdraft > 0) throw new RuntimeException("overdraft shouldn't be positive");
        if (balance < overdraft) throw new NotSufficientAmountException();
        this.balance = balance;
        this.overdraft = overdraft;
    }

    public void setBalance(int balance) throws NotSufficientAmountException {
        if (balance < getOverdraft()) throw new NotSufficientAmountException();
        this.balance = balance;}

    public int getBalance() {return this.balance;}
    public int getOverdraft() {return this.overdraft;}
}

