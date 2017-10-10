package five.presentation;

/**
 * Created by polosatik on 10.10.17.
 */
public class Presentation {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread newThread = new MyThread();

        newThread.start();
        System.out.println(Thread.currentThread().getName());



    }
}
