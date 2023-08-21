package BaiTap.BaiTap1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP = "127.0.0.1";
        int serverPort = 8080;
        Scanner scanner = new Scanner(System.in);

        Socket socket = new Socket(serverIP, serverPort);

        OutputStream outputStream = socket.getOutputStream();
        System.out.println("nhap so nguyen: ");
        int message1 = scanner.nextInt();
        System.out.println("nhap so nguyen: ");
        int message2 = scanner.nextInt();

        outputStream.write(message1);
        outputStream.write(message2);

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        System.out.println("tong hai so la: " + dataInputStream.read());
        socket.close();

    }
}
