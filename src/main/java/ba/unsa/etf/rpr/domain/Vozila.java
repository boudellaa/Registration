package ba.unsa.etf.rpr.domain;

import java.util.Objects;


/**
 *
 * @author Ali Boudellaa
 */


public class Vozila implements Idable {
    private int id, cijenaVozila;
    private String imeVozila, bojaVozila;
    private Vozaci vozac;


    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    public Vozila(int id, int cijenaVozila, String imeVozila, String bojaVozila, Vozaci vozac) {
        this.id = id;
        this.cijenaVozila = cijenaVozila;
        this.imeVozila = imeVozila;
        this.bojaVozila = bojaVozila;
        this.vozac = vozac;
    }

    public Vozila() {
    }

    public int getCijenaVozila() {
        return cijenaVozila;
    }

    public void setCijenaVozila(int cijenaVozila) {
        this.cijenaVozila = cijenaVozila;
    }

    public String getImeVozila() {
        return imeVozila;
    }

    public void setImeVozila(String imeVozila) {
        this.imeVozila = imeVozila;
    }

    public String getBojaVozila() {
        return bojaVozila;
    }

    public void setBojaVozila(String bojaVozila) {
        this.bojaVozila = bojaVozila;
    }

    public Vozaci getVozac() {
        return vozac;
    }

    public void setVozac(Vozaci vozac) {
        this.vozac = vozac;
    }

    @Override
    public String toString() {
        return "Vozila{" +
                "id=" + id +
                ", cijenaVozila=" + cijenaVozila +
                ", imeVozila='" + imeVozila + '\'' +
                ", bojaVozila='" + bojaVozila + '\'' +
                ", vozac=" + vozac +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vozila vozila)) return false;
        return getId() == vozila.getId() && getCijenaVozila() == vozila.getCijenaVozila() && Objects.equals(getImeVozila(), vozila.getImeVozila()) && Objects.equals(getBojaVozila(), vozila.getBojaVozila()) && Objects.equals(getVozac(), vozila.getVozac());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCijenaVozila(), getImeVozila(), getBojaVozila(), getVozac());
    }
}
