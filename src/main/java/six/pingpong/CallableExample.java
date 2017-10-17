package six.pingpong;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by polosatik on 17.10.17.
 */
public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> futureResult = executorService.submit(new ThreadToReturn());

        String result = futureResult.get();
        System.out.println(result);
        executorService.shutdown();

    }


    private static class ThreadToReturn implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println("Do some work!");
            Thread.currentThread().sleep(100L);
            return "result";
        }
    }
}
