package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Registracija;
import ba.unsa.etf.rpr.domain.Vozaci;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.util.List;

/**
 * Business Logic Layer for management of Registracija
 * @author Ali Boudellaa
 */
public class RegistracijaManager {

    public List<Registracija> getAll() throws RegistrationException {
        return DaoFactory.registracijaDao().getAll();
    }

    public Registracija add(Registracija r) throws RegistrationException {
        return DaoFactory.registracijaDao().add(r);
    }

    public void delete(int id) throws RegistrationException {
        DaoFactory.registracijaDao().delete(id);
    }

    public Registracija update(Registracija r) throws RegistrationException {
        return DaoFactory.registracijaDao().update(r);
    }

    public Registracija getById(int id) throws RegistrationException {
        return DaoFactory.registracijaDao().getById(id);
    }


}
