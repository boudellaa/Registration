package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.util.List;

public class VozilaManager {

    public List<Vozila> getAll() throws RegistrationException {
        return DaoFactory.vozilaDao().getAll();
    }

    public Vozila add(Vozila v) throws RegistrationException {
        return DaoFactory.vozilaDao().add(v);
    }

    public void delete(int id) throws RegistrationException {
        DaoFactory.vozilaDao().delete(id);
    }
}
