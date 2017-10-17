package homework.hwfive.PingPongN;

/**
 * Created by polosatik on 16.10.17.
 */
public class NThread extends Thread {

    String lock;
    int n;
    VolatileN volatileN;


    public NThread(String name, String lock, int n, VolatileN volatileN) {
        super(name);
        this.lock = lock;
        this.n = n;
        this.volatileN = volatileN;
    }



    @Override
    public void run() {

        while (n != volatileN.number){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        if (n == volatileN.number) {
            System.out.println(n);
            volatileN.number = n + 1;

        }

//        while (true) {
//            synchronized (lock) {
//
//                System.out.println(n);
//                int k = n+1;
//
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    lock.notify();
//                    lock.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}