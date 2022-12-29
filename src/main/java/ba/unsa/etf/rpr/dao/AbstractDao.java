package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Idable;
import ba.unsa.etf.rpr.exceptions.RegistrationException;

import java.sql.*;
import java.util.*;

public abstract class AbstractDao<T extends Idable> implements Dao<T> {

    private Connection connection;
    private String tableName;

    public AbstractDao(String tableName) {
        try{
            this.tableName = tableName;
            Properties p = new Properties();
            p.load(ClassLoader.getSystemResource("application.properties").openStream());
            String url = p.getProperty("db.connection_string");
            String username = p.getProperty("db.username");
            String password = p.getProperty("db.password");
            this.connection = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }

    public Connection getConnection(){
        return this.connection;
    }

    public void setConnection(Connection connection){
        this.connection = connection;
    }

    public abstract T row2object(ResultSet rs) throws RegistrationException;

    public abstract Map<String, Object> object2row(T object);

    public T getById(int id) throws RegistrationException {
        return executeQueryUnique("SELECT * FROM "+this.tableName+" WHERE id = ?", new Object[]{id});
    }


}
