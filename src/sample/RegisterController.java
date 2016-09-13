package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class RegisterController {

    public void construct() throws Exception {
        Stage dialog = new Stage();
        Parent page = FXMLLoader.load(getClass().getResource("Register.fxml"));

        Scene scene = new Scene(page);
        dialog.setScene(scene);
        dialog.show();
    }
}
