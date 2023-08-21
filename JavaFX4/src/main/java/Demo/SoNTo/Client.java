package Demo.SoNTo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP =  "127.0.0.1";
        int serverPort = 4444;
        Scanner scanner = new Scanner(System.in);
        Socket socket = new Socket(serverIP,serverPort);


        socket.close();
    }
}
