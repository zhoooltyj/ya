package homework.hwtwo.queue;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by polosatik on 25.09.17.
 */
public class QueueLife extends Queue {
    int timeLimit = 10;

    LocalDateTime[] datetime = new LocalDateTime[length];

    public QueueLife() {
    }

    public QueueLife(String a) {
        this.array[0] = a;
        this.datetime[0] = LocalDateTime.now();
    }


    void cleanArray() {
        int firstNotExpired = 0;

        while (datetime[firstNotExpired].isBefore(LocalDateTime.now().minus(timeLimit, ChronoUnit.SECONDS)) && firstNotExpired < length) {
            firstNotExpired++;
        }
        for (int j = 0; j < length - firstNotExpired; j++) {
            array[j] = array[firstNotExpired + j];
            datetime[j] = datetime[firstNotExpired + j];
        }

        for (int j = length - firstNotExpired; j < length; j++) {
            System.out.println("deleting " + array[j]);
            array[j] = null;
            datetime[j] = null;
        }

    }

    public void addElement(String a){
        cleanArray();

        if (array[length-1] != null) {
            throw new RuntimeException("array is full");
        }
        for (int i = 0; i < length; i++) {
            if (array[i] == null){
                array[i] = a;
                datetime[i] = LocalDateTime.now();
                break;
            }
        }
    }

    public String getElement() {

        cleanArray();

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
