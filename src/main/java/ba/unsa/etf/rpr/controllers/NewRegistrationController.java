package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NewRegistrationController {

    public Button cncBtn;

    public void cncBtnAction(ActionEvent actionEvent) {
        Stage stage = (Stage)cncBtn.getScene().getWindow();
        stage.close();
    }


}
