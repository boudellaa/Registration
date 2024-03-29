package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.business.RegistracijaManager;
import ba.unsa.etf.rpr.business.VozaciManager;
import ba.unsa.etf.rpr.business.VozilaManager;
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
import java.util.List;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;
import org.apache.commons.cli.*;

/**
 *Main class for CLI
 */
public class App {

    private static final Option addDriver = new Option("addD", "add-driver", false, "Adding new driver to database");
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

    public static Options addOptions() {
        Options options = new Options();
        options.addOption(addDriver);
        options.addOption(getVehicles);
        options.addOption(getDrivers);
        options.addOption(deleteVehicle);
        options.addOption(deleteDriver);
        options.addOption(deleteRegistration);
        return options;
    }

    public static void main(String[] args) throws Exception {
        Options options = addOptions();
        CommandLineParser commandLineParser = new DefaultParser();
        CommandLine cl = commandLineParser.parse(options, args);

        VozaciManager vman = new VozaciManager();
        VozilaManager vozman = new VozilaManager();
        RegistracijaManager rman = new RegistracijaManager();

        if(cl.hasOption(getVehicles.getOpt()) || cl.hasOption(getVehicles.getLongOpt())){
            List<Vozila> v1 = vozman.getAll();
            if(v1 == null) System.out.println("There is no available vehicles!");
            else
                for(Vozila vozilo : v1) System.out.println(vozilo);
        }else if(cl.hasOption(getDrivers.getOpt()) || cl.hasOption(getDrivers.getLongOpt())){
            List<Vozaci> v1 = vman.getAll();
            if(v1 == null) System.out.println("There is no available drivers!");
            else
                for(Vozaci vozac : v1) System.out.println(vozac);
        }else if(cl.hasOption(deleteVehicle.getOpt()) || cl.hasOption(deleteVehicle.getLongOpt())){
            try{
                int id = Integer.parseInt(cl.getArgList().get(0));
                vozman.getById(id);
                vozman.delete(id);
                System.out.println("Vehicle deleted successfully!");
            }catch(Exception e){
                if(e.getMessage().contains("not found")) System.out.println("Vehicle does not exist!");
                else
                    System.out.println(e.getMessage());
            }
        }else if(cl.hasOption(deleteDriver.getOpt()) || cl.hasOption(deleteDriver.getLongOpt())){
            try{
                int id = Integer.parseInt(cl.getArgList().get(0));
                vman.getById(id);
                vman.delete(id);
                System.out.println("Driver deleted successfully!");
            }catch(Exception e){
                if(e.getMessage().contains("not found")) System.out.println("Driver does not exist!");
                else
                    System.out.println(e.getMessage());
            }
        }else if(cl.hasOption(deleteRegistration.getOpt()) || cl.hasOption(deleteRegistration.getLongOpt())){
            try{
                int id = Integer.parseInt(cl.getArgList().get(0));
                rman.getById(id);
                rman.delete(id);
                System.out.println("Registration deleted successfully!");
            }catch(Exception e){
                if(e.getMessage().contains("not found")) System.out.println("Registration does not exist!");
                else
                    System.out.println(e.getMessage());
            }
        }else if(cl.hasOption(addDriver.getOpt()) || cl.hasOption(addDriver.getLongOpt())){
            try {
                if (cl.getArgList().size() != 5) {
                    System.out.println("Invalid number of arguments! Expected 5 arguments, recieved " + cl.getArgList().size() + " arguments.");
                    System.out.println("[String vozacIme, String vozacPrezime, String adresa, String vozacUser, String vozacSifra]");
                } else {
                    Vozaci temp = vman.add(new Vozaci(0,cl.getArgList().get(0), cl.getArgList().get(1), cl.getArgList().get(2), cl.getArgList().get(3),cl.getArgList().get(4)));
                    System.out.println("Driver added to database successfully!");
                    System.out.println(temp);
                }
            } catch (Exception e) {
                System.out.println("Something went wrong with adding driver...");
                throw e;
            }
        }else printFormattedOptions(options);
        if(AbstractDao.getConnection() != null)
            AbstractDao.getConnection().close();
    }
}
