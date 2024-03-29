package ba.unsa.etf.rpr.controllers;

import javafx.scene.control.Alert;

/**
 * Controller class for showing allert
 */
public class AllertController {
    public static void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();
    }
}
