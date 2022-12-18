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

    public int getIdVozaca() {
        return idVozaca;
    }

    public void setIdVozaca(int idVozaca) {
        this.idVozaca = idVozaca;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
}
