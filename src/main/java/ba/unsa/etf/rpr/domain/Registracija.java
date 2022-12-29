package ba.unsa.etf.rpr.domain;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Ali Boudellaa
 */

public class Registracija implements Idable{
    private int id;
    private Date datum;
    private String imeFirme;

    private Vozila vozilo;


    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    public Registracija(int id, Date datum, String imeFirme, Vozila vozilo) {
        this.id = id;
        this.datum = datum;
        this.imeFirme = imeFirme;
        this.vozilo = vozilo;
    }

    public Registracija() {
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

    public Vozila getVozilo() {
        return vozilo;
    }

    public void setVozilo(Vozila vozilo) {
        this.vozilo = vozilo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Registracija that)) return false;
        return getId() == that.getId() && Objects.equals(getDatum(), that.getDatum()) && Objects.equals(getImeFirme(), that.getImeFirme()) && Objects.equals(getVozilo(), that.getVozilo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDatum(), getImeFirme(), getVozilo());
    }

    @Override
    public String toString() {
        return "Registracija{" +
                "id=" + id +
                ", datum=" + datum +
                ", imeFirme='" + imeFirme + '\'' +
                ", vozilo=" + vozilo +
                '}';
    }
}
