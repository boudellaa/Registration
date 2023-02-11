package ba.unsa.etf.rpr.controllers;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ResourceBundle;


public class UserController implements Initializable {

    @FXML
    private TableColumn<Vozila, String> bojaVozila;

    @FXML
    private TableColumn<Vozila, Integer> cijenaVozila;

    @FXML
    private TableColumn<Vozila, String> imeVozila;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
