package BaiTap.BaiTap2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String ServerIP = "127.0.0.1";
        int serverPort = 2020;
        Scanner sc = new Scanner(System.in);

        Socket socket = new Socket(ServerIP,serverPort);
        System.out.println("da ket noi voi server...oki");
        OutputStream outputStream = socket.getOutputStream();
        System.out.println("nhap IP: " );
        String serverIP = sc.nextLine();
        outputStream.write(serverIP.getBytes());
    }
}

