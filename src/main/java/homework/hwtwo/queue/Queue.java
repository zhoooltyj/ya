package homework.hwtwo.queue;

import java.util.Arrays;

/**
 * Created by polosatik on 25.09.17.
 */
public class Queue {
    int length = 256;

    String[] array = new String[length];

    public Queue() {
        }

    public Queue(String a) {
        this.array[0] = a;
    }

    public void addElement(String a){

        if (array[length-1] != null) {
            throw new RuntimeException("array is full");
        }
        for (int i = 0; i < length; i++) {
            if (array[i] == null){
                array[i] = a;
                break;
            }
        }
    }

    public String getElement() {
        if (array[0] != null) {
            String tmp = array[0];
            for (int i = 0; i < length-1; i++) {
                array[i] = array[i+1];
            }
            array[length-1] = null;
            return tmp;
        }
        else throw new RuntimeException("array is empty");
    }


}
