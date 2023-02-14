package ba.unsa.etf.rpr;

import static org.junit.Assert.assertTrue;

import ba.unsa.etf.rpr.business.RegistracijaManager;
import ba.unsa.etf.rpr.business.VozaciManager;
import ba.unsa.etf.rpr.business.VozilaManager;
import ba.unsa.etf.rpr.domain.Registracija;
import ba.unsa.etf.rpr.domain.Vozaci;
import ba.unsa.etf.rpr.domain.Vozila;
import ba.unsa.etf.rpr.exceptions.RegistrationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class AppTest 
{
    VozaciManager dman = new VozaciManager();
    VozilaManager vman = new VozilaManager();
    RegistracijaManager rman = new RegistracijaManager();

    @Test
    void getByIdVehicleTest() throws RegistrationException {
        List<Vozila> l = vman.getAll();
        Vozila v1 = l.get(0);
        int id = v1.getId();
        Vozila v2 = vman.getById(id);
        Assertions.assertEquals(v1, v2);
    }

    @Test
    void getByIdDriverTest() throws RegistrationException {
        List<Vozaci> l = dman.getAll();
        Vozaci d1 = l.get(0);
        int id = d1.getId();
        Vozaci d2 = dman.getById(id);
        Assertions.assertEquals(d1, d2);
    }

    @Test
    void getByIdRegistrationTest() throws RegistrationException {
        List<Registracija> l = rman.getAll();
        Registracija r1 = l.get(0);
        int id = r1.getId();
        Registracija r2 = rman.getById(id);
        Assertions.assertEquals(r1, r2);

    }


}
