package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller class for manipulation with home window
 */

public class HomeController {
    public Button signIn;
    public Button createAcc;

    /**
     * Opening new window for signing in app
     * @param actionEvent
     * @throws IOException
     */

    public void signInAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/signIn.fxml"));
        stage.setTitle("Login");
        stage.setScene(new Scene(root, 600, 400));
        stage.setResizable(false);
        stage.show();
    }

    /**
     * Opening new window for creating new account
     * @param actionEvent
     * @throws IOException
     */

    public void createAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/createAcc.fxml"));
        stage.setTitle("Create your account");
        stage.setScene(new Scene(root, 600, 400));
        stage.setResizable(false);
        stage.show();
    }
}
