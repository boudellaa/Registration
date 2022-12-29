package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.util.List;

public interface VozilaDao extends Dao<Vozila>{

    List<Vozila> searchByNameOfCar(String imeVozila) throws RegistrationException;

    List<Vozila> searchByPrice(int cijenaVozila) throws RegistrationException;

    List<Vozila> searchByColorOfCar(String bojaVozila) throws RegistrationException;
}
