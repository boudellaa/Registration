package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.VozaciManager;
import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.dao.VozaciDaoSQLImpl;
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

/**
 * Controller class for manipulation with window for creating account
 */

public class CreateAccController {
    public Button btnCancel;
    public TextField fieldName;
    public TextField fieldSurname;
    public TextField fieldAddress;
    public TextField fieldUsername;
    public PasswordField fieldPassword;
    public Button btnOK;

    public static Vozaci currentUser;

    final private VozaciDaoSQLImpl v = new VozaciDaoSQLImpl();

    /**
     * Closing current window
     * @param actionEvent
     */
    public void btnCancelAction(ActionEvent actionEvent) {
        Stage stage = (Stage)btnCancel.getScene().getWindow();
        stage.close();
    }

    /**
     * Adding a new user in database after checking if any field is empty or incorrect
     * @param actionEvent
     * @throws RegistrationException
     * @throws IOException
     */

    public void registerAction(ActionEvent actionEvent) throws RegistrationException, IOException {
        if(fieldName.getText().trim().isEmpty() || fieldSurname.getText().trim().isEmpty() ||
                fieldAddress.getText().trim().isEmpty() || fieldUsername.getText().trim().isEmpty() ||
                fieldPassword.getText().trim().isEmpty()){
            AllertController.showAlert("Error", "Field blank", "Text fields must be filled in!");
            return;
        }else if(fieldUsername.getText().trim().length() < 7 || fieldUsername.getText().trim().length() > 10)
            AllertController.showAlert("Error", "Invalid username", "Username lenght must be between 7 and 10 characters!");
        else if(fieldPassword.getText().trim().length() < 7 || fieldPassword.getText().trim().length() > 10)
            AllertController.showAlert("Error", "Invalid password", "Password lenght must be between 7 and 10 characters!");
        else if(v.searchByUsername(fieldUsername.getText().trim()) != null)
            AllertController.showAlert("Error", "Invalid username", "This username is already taken!");
        else{
            currentUser = DaoFactory.vozaciDao().add(new Vozaci(1,fieldName.getText().trim(), fieldSurname.getText().trim(), fieldAddress.getText().trim(),
                    fieldUsername.getText().trim(), fieldPassword.getText().trim()));
            Stage stage1 = (Stage)btnOK.getScene().getWindow();
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
