package Demo.ChanLe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int serverPort = 7070;

        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("dang ket noi voi Client...!");

        Socket socket = serverSocket.accept();
        System.out.println("ket noi thanh cong");

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        int number = dataInputStream.read();

        if (number % 2 == 0){
            System.out.printf("so chan la: " + number);
        }else if (number % 2 == 1){
            System.out.printf("so le la: " + number);
        }else {
            System.out.printf("so nhap vao khong hop le...!");
        }

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.write(number);
        socket.close();
        serverSocket.close();
    }
}
