package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Vozaci;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

public class VozaciManager {
    public Vozaci add(Vozaci v) throws RegistrationException {
        return DaoFactory.vozaciDao().add(v);
    }
}
