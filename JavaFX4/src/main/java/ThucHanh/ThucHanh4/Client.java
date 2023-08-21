package ThucHanh.ThucHanh4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP = "127.0.0.1";
        int serverPort = 8080;

        //tao socket de ket noi server
        Socket socket = new Socket(serverIP,serverPort);

        //gui du lieu tu client sang server
        OutputStream outputStream = socket.getOutputStream();
        String message = "xin chao JavaFX ! ";
        outputStream.write(message.getBytes());

        //dong ket noi
        socket.close();

    }
}
