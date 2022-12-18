package ba.unsa.etf.rpr.domain;

import java.util.Date;

public class Vozaci {
    private int idVozaca;
    private String ime, prezime, adresa;
    private Date datum;

    public Vozaci(int idVozaca, String ime, String prezime, String adresa, Date datum) {
        this.idVozaca = idVozaca;
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.datum = datum;
    }
}
