package lk.ijse.gdse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class SeverApp {
    public static void main(String[] args) throws IOException {
        final int port = 8000;
        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("Sever is running in port " + port);

        Socket localSocket = serverSocket.accept();
        System.out.println("POrt "+ localSocket.getPort() );
        System.out.println("IP "+localSocket.getInetAddress());

        InputStreamReader inputStreamReader=new InputStreamReader(localSocket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String clientMsg = bufferedReader.readLine();

        System.out.println("Client says : "+ clientMsg);
    }
}
