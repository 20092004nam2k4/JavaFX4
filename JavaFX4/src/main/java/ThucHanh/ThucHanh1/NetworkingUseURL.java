package ThucHanh.ThucHanh1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkingUseURL {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://github.com/");

        InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = bufferedReader.readLine())!= null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
