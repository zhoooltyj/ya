package five.presentation;

/**
 * Created by polosatik on 10.10.17.
 */
public class Account {

    private long amount;
    private String name;

    public Account(long amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                '}';
    }
}
