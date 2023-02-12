package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Registracija;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.util.List;

public class RegistracijaManager {

    public List<Registracija> getAll() throws RegistrationException {
        return DaoFactory.registracijaDao().getAll();
    }

    public Registracija add(Registracija r) throws RegistrationException {
        return DaoFactory.registracijaDao().add(r);
    }
}
