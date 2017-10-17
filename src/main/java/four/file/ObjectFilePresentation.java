package four.file;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by polosatik on 03.10.17.
 */
//public class ObjectFilePresentation {
//    public static void main(String[] args) throws IOException {
//        DataObject data = new DataObject("Some data");
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/polosatik/Documents/git/ya/src/four/file/new_object_file.ser"));
//
//        oos.writeObject(data);
//        oos.flush();
//        oos.close();
//
//    }
//
//}

public class ObjectFilePresentation {
    public static void main(String[] args) {

        DataObject data = new DataObject("Some data");
        String path = "/Users/polosatik/Documents/git/ya/src/four/file/object_file.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        ) {
            oos.writeObject(data);
            oos.flush();

            DataObject dataObject = (DataObject) ois.readObject();
            System.out.println(dataObject);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}