package five.presentation;

import java.util.IllegalFormatCodePointException;

/**
 * Created by polosatik on 10.10.17.
 */
public class AccountService {
    public void transfer (Account from, Account to, long amount) {
        if (from.getAmount() >= amount) {
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);
            return;


        }
        throw new IllegalStateException("Account " + from + "doesn't have enough money");
    }
}
