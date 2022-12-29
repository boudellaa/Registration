package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.sql.*;
import java.util.*;

public class VozilaDaoSQLImpl extends AbstractDao<Vozila> implements VozilaDao {

    public VozilaDaoSQLImpl() {
        super("vozila");
    }

    @Override
    public Vozila row2object(ResultSet rs) throws RegistrationException {
        try {
            Vozila v = new Vozila();
            v.setId(rs.getInt("id"));
            v.setImeVozila(rs.getString("imeVozila"));
            v.setCijenaVozila(rs.getInt("cijenaVozila"));
            v.setBojaVozila(rs.getString("bojaVozila"));
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
        return m;
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
