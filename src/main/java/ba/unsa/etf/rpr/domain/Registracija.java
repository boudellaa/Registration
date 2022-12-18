package ba.unsa.etf.rpr.domain;

import java.util.Date;

public class Registracija {
    private int idRegistracije, idVozila;
    private Date datum;
    private String imeFirme;

    public Registracija(int idRegistracije, int idVozila, Date datum, String imeFirme) {
        this.idRegistracije = idRegistracije;
        this.idVozila = idVozila;
        this.datum = datum;
        this.imeFirme = imeFirme;
    }


}
