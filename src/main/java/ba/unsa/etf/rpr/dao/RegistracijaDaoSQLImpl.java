package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Registracija;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.sql.ResultSet;
import java.util.Map;
import java.util.TreeMap;

public class RegistracijaDaoSQLImpl extends AbstractDao<Registracija> implements RegistracijaDao{

    public RegistracijaDaoSQLImpl() {
        super("Registracija");
    }

    @Override
    public Registracija row2object(ResultSet rs) throws RegistrationException {
        try {
            Registracija r = new Registracija();
            r.setId(rs.getInt("id"));
            r.setDatum(rs.getDate("datum"));
            r.setVozilo(DaoFactory.vozilaDao().getById(rs.getInt("vozilo")));
            return r;
        } catch (Exception e) {
            throw new RegistrationException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(Registracija object) {
        Map<String, Object> m = new TreeMap<String, Object>();
        m.put("id", object.getId());
        m.put("datum", object.getDatum());
        m.put("vozilo", object.getVozilo().getId());
        return m;
    }
}
