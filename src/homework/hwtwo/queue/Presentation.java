package homework.hwtwo.queue;

/**
 * Created by polosatik on 25.09.17.
 */
public class Presentation {
    public static void main(String[] args) {
        QueueLife queueLife = new QueueLife("abc");

        queueLife.addElement("def");

        System.out.println("Element " + queueLife.getElement());

        System.out.println("Element " + queueLife.getElement());

    }
}
