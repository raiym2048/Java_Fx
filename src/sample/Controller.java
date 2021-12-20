package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    void r(ActionEvent event) {

    }

    @FXML
    void initialize() {

        sign_in.setOnAction(actionEvent -> {
            String LoginText = login_field.getText().trim();
            String LoginPassword = password_field.getText().trim();

            if(!LoginText.equals("") && !LoginPassword.equals("")){
                LogunUser(LoginText,LoginPassword);
            System.out.println("Email: " + login_field.getText());
            System.out.println("Password: " + password_field.getText());}
            else {
                System.out.println("Вы не заполнили поля!");
            }

        });

        register.setOnAction(actionEvent -> {
            register.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/app.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root  = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }

    private void LogunUser(String loginText, String loginPassword) {

    }

}
