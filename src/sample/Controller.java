package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class Controller {


    public Controller(){
        System.out.println("Controller funzt");
    }


    @FXML
    private TextField txtLoginUsername;


    @FXML
    private Button btnLoginOk;

    @FXML
    private PasswordField txtLoginPassword;

    @FXML
    void loginAction(ActionEvent event) {
        System.out.println("OK");
    }

    @FXML
    void loginAbort(ActionEvent event) {

    }

    @FXML
    void registerAction(ActionEvent event) {
        System.out.println("Regstrieren");
    }

}
