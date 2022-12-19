package ba.unsa.etf.rpr.domain;

import java.util.Date;
import java.util.Objects;


/**
 *
 * @author Ali Boudellaa
 */


public class Vozaci implements Idable{
    private int idVozaca;
    private String vozac, adresa;
    private Date datum;

    public Vozaci(int idVozaca, String vozac, String adresa, Date datum) {
        this.idVozaca = idVozaca;
        this.vozac = vozac;
        this.adresa = adresa;
        this.datum = datum;
    }

    public Vozaci() {
    }

    @Override
    public void setId(int id) {
        this.idVozaca = id;
    }

    @Override
    public int getId() {
        return idVozaca;
    }


    public String getVozac() {
        return vozac;
    }

    public void setVozac(String vozac) {
        this.vozac = vozac;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vozaci)) return false;
        Vozaci vozaci = (Vozaci) o;
        return getId() == vozaci.getId() && Objects.equals(getVozac(), vozaci.getVozac())  && Objects.equals(getAdresa(), vozaci.getAdresa()) && Objects.equals(getDatum(), vozaci.getDatum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVozac(), getAdresa(), getDatum());
    }

    @Override
    public String toString() {
        return "Vozaci{" +
                "idVozaca=" + idVozaca +
                ", vozac='" + vozac + '\'' +
                ", adresa='" + adresa + '\'' +
                ", datum=" + datum +
                '}';
    }

}
