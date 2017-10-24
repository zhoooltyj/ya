package seven.presentation;

import five.presentation.Account;
import five.presentation.AccountService;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by polosatik on 24.10.17.
 */

public class ConcurrentUtil {

    private static class BankThread implements Runnable {

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
//            for (int i = 0; i < 500_000; i++) {
            accountService.transfer(from, to, 1);
            accountService.transfer(to, from, 1);
//            }
        }
    }

    public static void shoot(Runnable runnable, int threadCount, int repeat) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(threadCount);
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(() -> {
                try {
                    cyclicBarrier.await();
                    for (int j = 0; j < repeat; j++) {
                        runnable.run();
                    }
                } catch (InterruptedException | BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            });
            threads[i] = thread;
            thread.start();
        }

        for (int i = 0; i < threadCount; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}