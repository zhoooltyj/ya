package homework.hwtwo.account;

import homework.hwtwo.account.Account;
import homework.hwtwo.account.NotSufficientAmountException;

/**
 * Created by polosatik on 25.09.17.
 */
public class Transfer {

    public Transfer(Account account1, Account account2, int sum) throws NotSufficientAmountException {
        int a = account1.getBalance() - sum;
        if (a < account1.getOverdraft()) throw new NotSufficientAmountException();

        int b = account2.getBalance() + sum;
        if (b < account2.getOverdraft()) throw new NotSufficientAmountException();

        account1.setBalance(a);
        account2.setBalance(b);
    }

// в каком случае стоит бросать эксепшн??
}
