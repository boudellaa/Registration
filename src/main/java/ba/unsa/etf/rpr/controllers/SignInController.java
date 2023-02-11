package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignInController {
    public Button btnCancel;
    public TextField usernameF;
    public PasswordField passwordF;
    public Button btnSgn;

    public void actionClose(ActionEvent actionEvent) {
        Stage stage = (Stage)btnCancel.getScene().getWindow();
        stage.close();
    }

    public void btnSgnAction(ActionEvent actionEvent) {
        if(usernameF.getText().trim().isEmpty() || passwordF.getText().trim().isEmpty()){
            AllertController.showAlert("Error", "Field blank", "Text fields must be filled in!");
        }else if(usernameF.getText().trim().length() < 7 || usernameF.getText().trim().length() > 10){
            AllertController.showAlert("Error", "Invalid username", "Username needs to be beetween 7 and 10 characters long!");
        }
    }
}
