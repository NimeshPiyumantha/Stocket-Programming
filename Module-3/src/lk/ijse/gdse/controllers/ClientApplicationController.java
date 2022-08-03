package lk.ijse.gdse.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class ClientApplicationController implements Initializable {

    public TextArea txtArea;
    public TextField textMessage;
    public Button sendOnAction;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void sendOnaction(ActionEvent actionEvent) {
    }
}
