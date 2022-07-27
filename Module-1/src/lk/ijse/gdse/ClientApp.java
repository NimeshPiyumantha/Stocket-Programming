package lk.ijse.gdse;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class ClientApp {
    public static void main(String[] args) throws IOException {

        final int PORT = 8000;
        Socket socket = new Socket("localhost", PORT);

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("Hello sever,How are you ?");
        printWriter.flush();
    }
}
