package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Vozaci;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.util.List;

/**
 * Business Logic Layer for management of Vozaci
 * @author Ali Boudellaa
 */

public class VozaciManager {

    public Vozaci add(Vozaci v) throws RegistrationException {
        return DaoFactory.vozaciDao().add(v);
    }

    public List<Vozaci> getAll() throws RegistrationException {
        return DaoFactory.vozaciDao().getAll();
    }

    public Vozaci getById(int id) throws RegistrationException {
        return DaoFactory.vozaciDao().getById(id);
    }

    public void delete(int id) throws RegistrationException {
        DaoFactory.vozaciDao().delete(id);
    }

    public Vozaci update(Vozaci v) throws RegistrationException {
        return DaoFactory.vozaciDao().update(v);
    }

    public Vozaci searchByUsername(String username) throws RegistrationException {
        return DaoFactory.vozaciDao().searchByUsername(username);
    }

    public static boolean userCheck(String username){
        if(username.length() < 7 || username.length() > 10 || username.isEmpty()) return false;
        return true;
    }

    public static boolean passwordCheck(String password){
        if(password.length() < 7 || password.length() > 10 || password.isEmpty()) return false;
        return true;
    }


}
