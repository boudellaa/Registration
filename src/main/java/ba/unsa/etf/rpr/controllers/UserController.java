package ba.unsa.etf.rpr.controllers;
import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.dao.VozilaDaoSQLImpl;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


public class UserController {
    public Button clsButton;
    public Button ngBtn;
    @FXML
    private TableView table;
    @FXML
    private TableColumn<Vozila, String> bojaVozila;

    @FXML
    private TableColumn<Vozila, Integer> cijenaVozila;

    @FXML
    private TableColumn<Vozila, String> imeVozila;

    @FXML
    public void initialize() throws RegistrationException {
        bojaVozila.setCellValueFactory(new PropertyValueFactory<>("bojaVozila"));
        imeVozila.setCellValueFactory(new PropertyValueFactory<>("imeVozila"));
        cijenaVozila.setCellValueFactory(new PropertyValueFactory<>("cijenaVozila"));
        List<Vozila> l = DaoFactory.vozilaDao().searchByVozac(SignInController.CurrentUser);
        if(l == null) return;
        ObservableList<Vozila> ob = FXCollections.observableArrayList();
        ob.addAll(l);
        table.setItems(ob);
    }

    public void clsButtonAction(ActionEvent actionEvent) {
        Stage stage = (Stage)clsButton.getScene().getWindow();
        stage.close();
    }

    public void ngBtnAction(ActionEvent actionEvent) throws IOException {
        Stage stage1 = (Stage)ngBtn.getScene().getWindow();
        stage1.close();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/newReg.fxml"));
        stage.setTitle("New registration");
        stage.setScene(new Scene(root, 600, 400));
        stage.setResizable(false);
        stage.show();
    }
}
