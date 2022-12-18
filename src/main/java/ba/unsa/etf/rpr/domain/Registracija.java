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

    public int getIdRegistracije() {
        return idRegistracije;
    }

    public void setIdRegistracije(int idRegistracije) {
        this.idRegistracije = idRegistracije;
    }

    public int getIdVozila() {
        return idVozila;
    }

    public void setIdVozila(int idVozila) {
        this.idVozila = idVozila;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getImeFirme() {
        return imeFirme;
    }

    public void setImeFirme(String imeFirme) {
        this.imeFirme = imeFirme;
    }
}
