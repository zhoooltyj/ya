package homework.hwtwo.account;

/**
 * Created by polosatik on 25.09.17.
 */
public class Presentation {
    public static void main(String[] args) throws NotSufficientAmountException {
        Account account1 = new Account(-5, -20);
        Account account2 = new Account();
        System.out.println("Account1 " + account1.balance);
        System.out.println("Account2 " + account2.balance);

        Transfer transfer1 = new Transfer(account1, account2, 10);
        System.out.println("Account1 after transfer: " + account1.balance);
        System.out.println("Account2 after transfer: " + account2.balance);

    }
}
