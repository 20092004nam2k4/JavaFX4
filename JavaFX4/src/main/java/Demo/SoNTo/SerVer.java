package Demo.SoNTo;

import javax.imageio.IIOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SerVer {
    public static void main(String[] args) throws IOException {
        int serverPort = 4444;

        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("dang ket noi voi Client...!");

        Socket socket = serverSocket.accept();
        System.out.println("ket noi thanh cong");

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());



        int number = dataInputStream.read();
        System.out.println(number);

        String a="cdkshckd";

        dataOutputStream.write(a.getBytes());
//        for (int i = 2 ; i <= Math.sqrt(number) ; i++  ){
//            if(number % i == 0 || number <= 1){
//
//                dataOutputStream.write(number);
//            }else if (number % i == 1 || number % i == 0){
//                dataOutputStream.write(number);
//            }
//        }
        socket.close();
        serverSocket.close();
    }
}
