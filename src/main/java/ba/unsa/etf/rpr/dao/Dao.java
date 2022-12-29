package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.util.List;

public interface Dao<T> {

    T getById(int id) throws RegistrationException;

    /**
     * adds new object in database
     */

    T add(T t) throws RegistrationException;

    /**
     * updates an object in database
     */

    T update(T t) throws RegistrationException;

    /**
     * deletes an object in database
     */

    void delete(int id) throws RegistrationException;

    /**
     * @return all objects from database
     */

    List<T> getAll() throws RegistrationException;
}
