package lk.ijse.gdse;

import java.io.IOException;
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
    }
}
