package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Registracija;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.Date;

public class NewRegistrationController {

    public Button cncBtn;
    public Button btnOK;
    public TextField fieldPrice;
    public TextField fieldColor;
    public TextField fieldName;

    public void cncBtnAction(ActionEvent actionEvent) {
        Stage stage = (Stage)cncBtn.getScene().getWindow();
        stage.close();
    }


    public void btnOkAction(ActionEvent actionEvent) throws RegistrationException {
        if(fieldPrice.getText().trim().isEmpty() || fieldColor.getText().trim().isEmpty() || fieldName.getText().trim().isEmpty()){
            AllertController.showAlert("Error", "Field blank", "Text fields must be filled in!");
            return;
        }
        Vozila v = DaoFactory.vozilaDao().add(new Vozila(1, Integer.parseInt(fieldPrice.getText().trim()), fieldName.getText().trim(), fieldColor.getText().trim(),
                UserController.currentUser));
        LocalDate date = LocalDate.now();
        DaoFactory.registracijaDao().add(new Registracija(1, date, v));
    }
}
