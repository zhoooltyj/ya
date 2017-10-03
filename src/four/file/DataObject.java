package four.file;

import java.io.Serializable;

/**
 * Created by polosatik on 03.10.17.
 */
public class DataObject implements Serializable{
    private String data;

    public DataObject() {
    }

    public DataObject(String data) {

        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
