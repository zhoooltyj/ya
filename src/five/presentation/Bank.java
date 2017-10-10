package five.presentation;

/**
 * Created by polosatik on 10.10.17.
 */
public class Bank {
    public static void main(String[] args) throws InterruptedException {
        AccountService accountService = new AccountService();
        Account john = new Account(1_000_000, "John");
        Account kate = new Account(1_000_000, "Kate");

        BankThread bankThread1 = new BankThread(john, kate, accountService);
        BankThread bankThread2 = new BankThread(john, kate, accountService);
        bankThread1.start();
        bankThread2.start();

        bankThread1.join();
        bankThread2.join();

        System.out.println(john);
        System.out.println(kate);

    }

    private static class BankThread extends Thread {
        private Account from;
        private Account to;
        private AccountService accountService;

        public BankThread(Account from, Account to, AccountService accountService) {
            this.from = from;
            this.to = to;
            this.accountService = accountService;
        }

        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {
                accountService.transfer(from, to, 1);
            }
        }
    }
}
