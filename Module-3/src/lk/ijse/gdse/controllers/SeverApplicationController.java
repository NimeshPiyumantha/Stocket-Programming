package lk.ijse.gdse.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class SeverApplicationController implements Initializable {


    public TextArea txtArea;
    public TextField textMessage;
    public Button sendOnAction;

    final int PORT = 8000;
    ServerSocket serverSocket;
    Socket accept;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;
    String message ="";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        new Thread(() -> {
            try {
                serverSocket = new ServerSocket(PORT);
                txtArea.appendText("Server Started..");
                accept = serverSocket.accept();
                txtArea.appendText("\nClient Connected..");

                dataInputStream = new DataInputStream(accept.getInputStream());
                dataOutputStream = new DataOutputStream(accept.getOutputStream());

                while (!message.equals("exit")){
                    message = dataInputStream.readUTF();
                    txtArea.appendText("\nClient : " + message);
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        }).start();
    }

    public void sendOnAction(ActionEvent actionEvent) throws IOException {
        dataOutputStream.writeUTF(textMessage.getText().trim());
        dataOutputStream.flush();
    }
}
