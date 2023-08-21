package BaiTap.BaiTap3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String IP = "localhost";
        int Port = 2045;

        Socket socket = new Socket(IP,Port);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Soan tin nhan: ");
        String message = scanner.nextLine();
        dataOutputStream.write(message.getBytes());
        System.out.println("sent: " + message);
    }

}
