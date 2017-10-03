package four.socket;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by polosatik on 03.10.17.
 */
public class PresentationClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8000); // можно было "localhost"
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        dataOutputStream.writeUTF("Маша");
        dataOutputStream.flush();
        dataOutputStream.close();
        socket.close();
    }
}
