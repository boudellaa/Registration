package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Vozaci;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.util.List;

/**
 * Business Logic Layer for management of Vozila
 * @author Ali Boudellaa
 */

public class VozilaManager {

    public List<Vozila> getAll() throws RegistrationException {
        return DaoFactory.vozilaDao().getAll();
    }

    public Vozila add(Vozila v) throws RegistrationException {
        return DaoFactory.vozilaDao().add(v);
    }

    public Vozila getById(int id) throws RegistrationException {
        return DaoFactory.vozilaDao().getById(id);
    }

    public void delete(int id) throws RegistrationException {
        DaoFactory.vozilaDao().delete(id);
    }

    public Vozila update(Vozila v) throws RegistrationException {
        return DaoFactory.vozilaDao().update(v);
    }

    public List<Vozila> searchByVozac(Vozaci v) throws RegistrationException {
        return DaoFactory.vozilaDao().searchByVozac(v);
    }

}
