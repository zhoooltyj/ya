package homework.hwfive;

/**
 * Created by polosatik on 16.10.17.
 */
public class Presentation
{
    public static void main(String[] args) throws InterruptedException {

        String lock = "lock";

        Thread newPingThread = new PingThread("Ping", lock);
        newPingThread.start();

        new PingThread("Pong", lock)
                .start();

        Thread.sleep(500l);
    }



}
