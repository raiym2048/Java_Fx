package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Email;

    @FXML
    private ImageView image1;

    @FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    private Button sign_in;

    @FXML
    private TextField surname;

    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        sign_in.setOnAction(actionEvent -> {
            dbHandler.SignUpUser(name.getText(),surname.getText(), Email.getText(),password.getText());
        });

    }

}
