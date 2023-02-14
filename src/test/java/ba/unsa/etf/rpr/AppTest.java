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
        int id1 = v2.getId();
        Assertions.assertEquals(id, id1);
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
        int id1 = r2.getId();
        Assertions.assertEquals(id, id1);

    }

    @Test
    void addDriverTest() throws RegistrationException {
       Vozaci v = new Vozaci(500, "Test", "Testic", "testna", "test1234", "test1234");
       v = dman.add(v);
       List<Vozaci> l = dman.getAll();
       boolean dodan = false;
       for(Vozaci voz : l)
           if(v.getId() == voz.getId()) dodan = true;
       Assertions.assertTrue(dodan);
    }


    @Test
    void deleteDriverTest() throws RegistrationException{
       dman.delete(500);
       boolean obrisan = true;
       List<Vozaci> l = dman.getAll();
       for(Vozaci voz : l)
           if(500 == voz.getId())
               obrisan = false;
       Assertions.assertTrue(obrisan);
    }

    @Test
    void UpdateVehicleTest() throws RegistrationException {
       List<Vozila> l = vman.getAll();
       Vozila v = l.get(0);
       String temp = v.getImeVozila();
       v.setImeVozila("test");
       vman.update(v);
       l = vman.getAll();
       boolean izmijenjen = false;
       for(Vozila voz : l)
           if(voz.getImeVozila().equals(v.getImeVozila())) izmijenjen = true;
       Assertions.assertTrue(izmijenjen);
       v.setImeVozila(temp);
       vman.update(v);
    }





}
