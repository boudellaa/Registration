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

import java.io.PrintWriter;
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
    private static final Option addRegistration = new Option("addR", "add-registration", false, "Adding new registration to database");
    private static final Option getVehicles = new Option("getV", "get-vehicles", false, "Printing all vehicles database");
    private static final Option getDrivers = new Option("getD", "get-drivers", false, "Printing all drivers database");
    private static final Option deleteVehicle = new Option("delV", "del-vehicle",false, "Deleting vehicle(by its id) from database");
    private static final Option deleteDriver = new Option("delD", "del-driver",false, "Deleting driver(by its id) from database");
    private static final Option deleteRegistration = new Option("delR", "del-registration",false, "Deleting registration(by its id) from database");

    public static void printFormattedOptions(Options options) {
        HelpFormatter helpFormatter = new HelpFormatter();
        PrintWriter printWriter = new PrintWriter(System.out);
        helpFormatter.printUsage(printWriter, 150, "java -jar Projekat.jar [option] 'something else if needed' ");
        helpFormatter.printOptions(printWriter, 150, options, 2, 7);
        printWriter.close();
    }
    public static void main(String[] args) throws RegistrationException {
    }
}
