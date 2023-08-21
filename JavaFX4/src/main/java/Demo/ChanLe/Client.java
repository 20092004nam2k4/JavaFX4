package Demo.ChanLe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverIP =  "127.0.0.1";
        int serverPort = 7070;
        Scanner scanner = new Scanner(System.in);

        Socket socket = new Socket(serverIP,serverPort);

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        System.out.printf("nhap mot so kiem tra chan le: ");
        int number = scanner.nextInt();
        dataOutputStream.write(number);

        if (number % 2 == 0){
            System.out.printf("so chan la: ");
        }else if (number % 2 == 1){
            System.out.printf("so le la: " );
        }else {
            System.out.printf("so nhap vao khong hop le...!");
        }

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        System.out.println(+ dataInputStream.read());

        socket.close();
    }
}
