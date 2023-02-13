package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.dao.*;
import ba.unsa.etf.rpr.domain.Registracija;
import ba.unsa.etf.rpr.domain.Vozaci;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.util.Date;
import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;
import org.apache.commons.cli.*;

/**
 *Main class for CLI
 */
public class App {

    private static final Option addVehicle = new Option("addV", "add-vehicle", false, "Adding new vehicle to database");
    private static final Option addDriver = new Option("addD", "add-driver", false, "Adding new driver to database");



    public static void main(String[] args) throws RegistrationException {
    }
}
