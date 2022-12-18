package ba.unsa.etf.rpr.domain;

import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Registracija)) return false;
        Registracija that = (Registracija) o;
        return getIdRegistracije() == that.getIdRegistracije() && getIdVozila() == that.getIdVozila() && Objects.equals(getDatum(), that.getDatum()) && Objects.equals(getImeFirme(), that.getImeFirme());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdRegistracije(), getIdVozila(), getDatum(), getImeFirme());
    }
}
