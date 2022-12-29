package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.util.List;

public interface Dao<T> {

    T getById(int id) throws RegistrationException;

    T add(T t) throws RegistrationException;

    T update(T t) throws RegistrationException;

    void delete(int id) throws RegistrationException;

    List<T> getAll() throws RegistrationException;
}
