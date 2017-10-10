package five.presentation;

/**
 * Created by polosatik on 10.10.17.
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());


    }
}
