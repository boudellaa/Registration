package ba.unsa.etf.rpr.dao;

public class DaoFactory {
    private static final VozilaDao vozilaDao = new VozilaDaoSQLImpl();
    private static final VozaciDao vozaciDao = new VozaciDaoSQLImpl();
    private static final RegistracijaDao registracijaDao = new RegistracijaDaoSQLImpl();

    private DaoFactory() {
    }


    public static VozilaDao vozilaDao(){
        return vozilaDao;
    }
    public static VozaciDao vozaciDao(){
        return vozaciDao;
    }
    public static RegistracijaDao registracijaDao(){
        return registracijaDao;
    }

}
