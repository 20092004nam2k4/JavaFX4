package ThucHanh.ThucHanh4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 8080;

        // tao serverSocket de lay du lieu tu client
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("server dang ket noi...!");

        //chap nhan ket noi
        Socket socket = serverSocket.accept();
        System.out.println("Client da duoc ket noi.");

        //doc du lieu tu client
        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int byteRead = inputStream.read(buffer);
        String message =  new String( buffer, 0 ,byteRead);
        System.out.println("nhan tin nhan tu Client :" + message);

        socket.close();
        serverSocket.close();
    }
}
