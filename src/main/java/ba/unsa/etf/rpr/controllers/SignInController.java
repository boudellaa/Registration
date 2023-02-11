package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Vozaci;
import ba.unsa.etf.rpr.exceptions.RegistrationException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class SignInController {
    public Button btnCancel;
    public TextField usernameF;
    public PasswordField passwordF;
    public Button btnSgn;

    public static Vozaci CurrentUser;

    public void actionClose(ActionEvent actionEvent) {
        Stage stage = (Stage)btnCancel.getScene().getWindow();
        stage.close();
    }

    public void btnSgnAction(ActionEvent actionEvent) throws IOException, RegistrationException {
        if(usernameF.getText().trim().isEmpty() || passwordF.getText().trim().isEmpty()){
            AllertController.showAlert("Error", "Field blank", "Text fields must be filled in!");
            return;
        }

        Vozaci v = DaoFactory.vozaciDao().searchByUsername(usernameF.getText());
        if(v == null) AllertController.showAlert("Error", "Username not found!", "No user with that username!");
        else if(!passwordF.getText().equals(v.getVozacSifra())) AllertController.showAlert("Error","Incorrect password!","Incorrect password, try again!");
        else{
            CurrentUser = v;
            Stage stage1 = (Stage)btnSgn.getScene().getWindow();
            stage1.close();
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/FXML/user.fxml"));
            stage.setTitle("Your registred vehicles");
            stage.setScene(new Scene(root, 600, 400));
            stage.setResizable(false);
            stage.show();
        }
    }
}
