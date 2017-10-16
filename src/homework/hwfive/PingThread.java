package homework.hwfive;

import java.util.Date;

/**
 * Created by polosatik on 16.10.17.
 */
public class PingThread extends Thread {

    String lock;


    public PingThread(String name, String lock) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}