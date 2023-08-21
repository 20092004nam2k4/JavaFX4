package BaiTap.BaiTap3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 2045;

        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("dang ket noi voi Client....!");

        Socket socket = serverSocket.accept();
        System.out.println("ket noi thanh cong....^^");

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        dataInputStream.read(message.getBytes());

        System.out.println(message);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.write(message.getBytes());
        socket.close();
        serverSocket.close();
    }
}
