package BaiTap.BaiTap2;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 2020;

        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("dang ket noi toi Client....!");

        Socket socket = serverSocket.accept();
        System.out.println("ket noi thanh cong...^^");

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        byte [] buffer = new byte[1024];
        int byteRead = dataInputStream.read(buffer);
        String message = new String(buffer,0,byteRead);

    }
}
