package homework.hwfive.PingPongN;

import five.presentation.VolatileExample;

/**
 * Created by polosatik on 16.10.17.
 */
public class NPresentation
{

    static VolatileN volatileN = new VolatileN();

    public static void main(String[] args) throws InterruptedException {

        int n = 3;
        int m = 5;

        String lock = "lock";

        for (int i = 0; i < m; i++) {


            for (int j = 0; j < n; j++) {
                Thread newPingThread = new NThread("Ping", lock, j, volatileN);
                newPingThread.start();
//                Thread.sleep(500l);

            }
            while(volatileN.number != n){
                Thread.sleep(10);
            }
            volatileN.number = 0;



        }

    }



}
