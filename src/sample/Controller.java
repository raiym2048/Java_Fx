package sample;

import java.beans.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button register;

    @FXML
    private Button sign_in;

    @FXML
    void initialize() {
        sign_in.setOnAction(actionEvent -> {
            System.out.println("You registered!");
        });
    }

}

