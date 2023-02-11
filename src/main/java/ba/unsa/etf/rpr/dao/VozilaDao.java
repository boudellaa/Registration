package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Vozaci;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.util.List;

public interface VozilaDao extends Dao<Vozila>{

    List<Vozila> searchByVozac(Vozaci v) throws RegistrationException;

}
