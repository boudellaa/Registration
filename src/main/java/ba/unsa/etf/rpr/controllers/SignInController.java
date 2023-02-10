package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SignInController {
    public Button btnCancel;

    public void actionClose(ActionEvent actionEvent) {
        Stage stage = (Stage)btnCancel.getScene().getWindow();
        stage.close();
    }
}
