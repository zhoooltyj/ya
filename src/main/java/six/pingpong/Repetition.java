package six.pingpong;

/**
 * Created by polosatik on 17.10.17.
 */
public class Repetition {


    private static volatile boolean lock = true;

    public static void main(String[] args) {
        Thread pingThread = new Thread(new PingThread());
        Thread pongThread = new Thread(new PongThread());

        pingThread.start();
        pongThread.start();
    }

    private static class PingThread implements Runnable {

        @Override
        public void run(){
            while (true) {
                if (lock) {
                    System.out.println("Ping");
                    lock = false;
                }
                }
            }

        }


    private static class PongThread implements Runnable {
        @Override
        public void run(){
            while (true) {
                if (!lock) {
                    System.out.println("Pong");
                    lock = true;
                }
            }

        }

    }

}
