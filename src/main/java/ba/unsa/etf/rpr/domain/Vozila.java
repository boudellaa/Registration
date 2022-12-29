package ba.unsa.etf.rpr.domain;

import java.util.Objects;


/**
 *
 * @author Ali Boudellaa
 */


public class Vozila implements Idable {
    private int id, cijenaVozila;
    private String imeVozila, bojaVozila;
    private int idVozaca;

    public Vozila(int id, int cijenaVozila, String imeVozila, String bojaVozila, int idVozaca) {
        this.id = id;
        this.cijenaVozila = cijenaVozila;
        this.imeVozila = imeVozila;
        this.bojaVozila = bojaVozila;
        this.idVozaca = idVozaca;
    }

    public Vozila() {
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
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

    public int getIdVozaca() {
        return idVozaca;
    }

    public void setIdVozaca(int idVozaca) {
        this.idVozaca = idVozaca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vozila)) return false;
        Vozila vozila = (Vozila) o;
        return getId() == vozila.getId() && getCijenaVozila() == vozila.getCijenaVozila() && getIdVozaca() == vozila.getIdVozaca() && Objects.equals(getImeVozila(), vozila.getImeVozila()) && Objects.equals(getGorivo(), vozila.getGorivo()) && Objects.equals(getBojaVozila(), vozila.getBojaVozila());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCijenaVozila(), getImeVozila(), getBojaVozila(), getIdVozaca());
    }

    @Override
    public String toString() {
        return "Vozila{" +
                "id=" + id +
                ", cijenaVozila=" + cijenaVozila +
                ", imeVozila='" + imeVozila + '\'' +
                ", bojaVozila='" + bojaVozila + '\'' +
                ", idVozaca=" + idVozaca +
                '}';
    }

}
