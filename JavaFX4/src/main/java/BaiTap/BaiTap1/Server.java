package BaiTap.BaiTap1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args)  throws IOException {
        int serverPort = 8080;

        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("server dang ket noi toi client.....!");

        Socket socket = serverSocket.accept();
        System.out.println("ket noi thanh cong");

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        int sum = dataInputStream.read()+dataInputStream.read();
        dataOutputStream.write(sum);
        socket.close();
        serverSocket.close();
    }
}
