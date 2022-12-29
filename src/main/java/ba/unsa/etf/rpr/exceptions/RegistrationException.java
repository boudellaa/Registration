package ba.unsa.etf.rpr.exceptions;

public class RegistrationException extends Exception{

    public RegistrationException(String msg, Exception reason){
        super(msg, reason);
    }

    public RegistrationException(String msg){
        super(msg);
    }
}
