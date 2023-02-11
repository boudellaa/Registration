package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Vozaci;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.sql.*;
import java.util.*;

public class VozilaDaoSQLImpl extends AbstractDao<Vozila> implements VozilaDao {

    public VozilaDaoSQLImpl() {
        super("Vozila");
    }

    @Override
    public Vozila row2object(ResultSet rs) throws RegistrationException {
        try {
            Vozila v = new Vozila();
            v.setId(rs.getInt("id"));
            v.setImeVozila(rs.getString("imeVozila"));
            v.setCijenaVozila(rs.getInt("cijenaVozila"));
            v.setBojaVozila(rs.getString("bojaVozila"));
            v.setVozac(DaoFactory.vozaciDao().getById(rs.getInt("vozac")));
            return v;
        } catch (Exception e) {
            throw new RegistrationException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(Vozila object) {
        Map<String, Object> m = new TreeMap<String, Object>();
        m.put("id", object.getId());
        m.put("imeVozila", object.getImeVozila());
        m.put("cijenaVozila", object.getCijenaVozila());
        m.put("bojaVozila", object.getBojaVozila());
        m.put("vozac", object.getVozac().getId());
        return m;
    }

    @Override
    public List<Vozila> searchByVozac(Vozaci v) throws RegistrationException {
        String query = "SELECT * FROM Vozila voz WHERE voz.vozac = ? && exists (SELECT * FROM Registracija r WHERE voz.id = r.vozilo)";
        if(v == null) return null;
        return super.executeQuery(query, new Object[]{v.getId()});
    }

    @Override
    public List<Vozila> searchByNameOfCar(String imeVozila) throws RegistrationException {
        String query = "SELECT * FROM Vozila WHERE Ime_vozila = ?";
        List<Vozila> v = new ArrayList<>();
        try{
            PreparedStatement p = getConnection().prepareStatement(query);
            p.setString(1, imeVozila);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                v.add(row2object(rs));
            }
            rs.close();
        }catch(SQLException e){
            throw new RegistrationException(e.getMessage(), e);
        }
        return v;
    }


    @Override
    public List<Vozila> searchByColorOfCar(String bojaVozila) throws RegistrationException {
        String query = "SELECT * FROM Vozila WHERE Boja_vozila = ?";
        List<Vozila> v = new ArrayList<>();
        try{
            PreparedStatement p = getConnection().prepareStatement(query);
            p.setString(1, bojaVozila);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                v.add(row2object(rs));
            }
            rs.close();
        }catch(SQLException e){
            throw new RegistrationException(e.getMessage(), e);
        }
        return v;
    }


    @Override
    public List<Vozila> searchByPrice(int cijenaVozila) throws RegistrationException {
        String query = "SELECT * FROM Vozila WHERE Cijena_vozila <= ?";
        List<Vozila> v = new ArrayList<>();
        try{
            PreparedStatement p = getConnection().prepareStatement(query);
            p.setInt(1, cijenaVozila);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                v.add(row2object(rs));
            }
            rs.close();
        }catch(SQLException e){
            throw new RegistrationException(e.getMessage(), e);
        }
        return v;

    }
}
