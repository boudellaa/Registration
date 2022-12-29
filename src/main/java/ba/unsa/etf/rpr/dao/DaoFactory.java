package ba.unsa.etf.rpr.dao;

public class DaoFactory {

    private static final RegistracijaDao registracijaDao = (RegistracijaDao) new RegistracijaDaoSQLImpl();
    private static final VozaciDao vozaciDao = (VozaciDao) new VozaciDaoSQLImpl();
    private static final VozilaDao vozilaDao = (VozilaDao) new VozilaDaoSQLImpl();

    private DaoFactory(){
    }

    public static RegistracijaDao registracijaDao(){
        return registracijaDao;
    }

    public static VozaciDao vozaciDao(){
        return vozaciDao;
    }

    public static VozilaDao vozilaDao(){
        return vozilaDao;
    }

}
