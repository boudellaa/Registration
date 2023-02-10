package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Vozaci;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.sql.ResultSet;
import java.util.Map;
import java.util.TreeMap;

public class VozaciDaoSQLImpl extends AbstractDao<Vozaci> implements VozaciDao{
    public VozaciDaoSQLImpl() {
        super("Vozaci");
    }

    private static VozaciDaoSQLImpl instance = null;

    public static VozaciDaoSQLImpl getInstance() {
        if (instance == null)
            instance = new VozaciDaoSQLImpl();
        return instance;
    }

    public static void removeInstance() {
        if (instance != null)
            instance = null;
    }

    @Override
    public Vozaci row2object(ResultSet rs) throws RegistrationException {
            try {
                Vozaci v = new Vozaci();
                v.setId(rs.getInt("id"));
                v.setVozacIme(rs.getString("vozacIme"));
                v.setVozacPrezime(rs.getString("vozacPrezime"));
                v.setAdresa(rs.getString("adresa"));
                v.setVozacUser(rs.getString("vozacUser"));
                v.setVozacSifra(rs.getString("vozacSifra"));
                return v;
            } catch (Exception e) {
                throw new RegistrationException(e.getMessage(), e);
            }
    }

    @Override
    public Map<String, Object> object2row(Vozaci object) {
        Map<String, Object> m = new TreeMap<String, Object>();
        m.put("id", object.getId());
        m.put("vozacIme", object.getVozacIme());
        m.put("vozacPrezime", object.getVozacPrezime());
        m.put("adresa", object.getAdresa());
        m.put("vozacUser", object.getVozacUser());
        m.put("vozacSifra", object.getVozacSifra());
        return m;
    }


    @Override
    public Vozaci searchByUsername(String username) throws RegistrationException {
        return super.executeQueryUnique("SELECT * FROM Vozaci WHERE vozaciUser = ?", new Object[]{username});
    }
}
