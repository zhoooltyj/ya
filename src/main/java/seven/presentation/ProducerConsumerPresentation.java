package seven.presentation;

/**
 * Created by polosatik on 24.10.17.
 */
public class ProducerConsumerPresentation {

    public static void main(String[] args) {

        Queue<Object> queue = new Queue<>();
        ConcurrentUtil.shoot(() ->{
            queue.push(new Object());
            queue.take();
        }, 4, 3);
    }

}
