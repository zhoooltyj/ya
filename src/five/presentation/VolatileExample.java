package five.presentation;

import java.util.concurrent.TimeUnit;

/**
 * Created by polosatik on 10.10.17.
 */
public class VolatileExample extends Thread {


    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();

        TimeUnit.SECONDS.sleep(1);
        thread.keepRunning = false;
        System.out.println("Set to false");

    }

    volatile boolean keepRunning = true;
    @Override
    public void run() {
        int count = 0;
        while (keepRunning) {
            ++count;
        }
        System.out.println(count);
    }
}
