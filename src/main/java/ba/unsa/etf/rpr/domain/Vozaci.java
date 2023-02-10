package ba.unsa.etf.rpr.domain;

import java.util.Date;
import java.util.Objects;


/**
 *
 * @author Ali Boudellaa
 */


public class Vozaci implements Idable{
    private int id;
    private String vozacIme, vozacPrezime, adresa, vozacUser, vozacSifra;

    public Vozaci(int id, String vozacIme, String vozacPrezime, String adresa, String vozacUser, String vozacSifra) {
        this.id = id;
        this.vozacIme = vozacIme;
        this.vozacPrezime = vozacPrezime;
        this.vozacUser = vozacUser;
        this.vozacSifra = vozacSifra;
        this.adresa = adresa;
    }

    public Vozaci() {
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getVozacIme() {
        return vozacIme;
    }

    public void setVozacIme(String vozacIme) {
        this.vozacIme = vozacIme;
    }

    public String getVozacPrezime() {
        return vozacPrezime;
    }

    public void setVozacPrezime(String vozacPrezime) {
        this.vozacPrezime = vozacPrezime;
    }

    public String getVozacUser() {
        return vozacUser;
    }

    public void setVozacUser(String vozacEmail) {
        this.vozacUser = vozacUser;
    }

    public String getVozacSifra() {
        return vozacSifra;
    }

    public void setVozacSifra(String vozacSifra) {
        this.vozacSifra = vozacSifra;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vozaci)) return false;
        Vozaci vozaci = (Vozaci) o;
        return getId() == vozaci.getId() && Objects.equals(getVozacIme(), vozaci.getVozacIme()) && Objects.equals(getVozacPrezime(), vozaci.getVozacPrezime()) && Objects.equals(getVozacUser(), vozaci.getVozacUser()) && Objects.equals(getVozacSifra(), vozaci.getVozacSifra()) && Objects.equals(getAdresa(), vozaci.getAdresa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVozacIme(), getVozacPrezime(), getVozacUser(), getVozacSifra(), getAdresa());
    }

    @Override
    public String toString() {
        return "Vozaci{" +
                "id=" + id +
                ", vozacIme='" + vozacIme + '\'' +
                ", vozacPrezime='" + vozacPrezime + '\'' +
                ", vozacEmail='" + vozacUser + '\'' +
                ", vozacSifra='" + vozacSifra + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
