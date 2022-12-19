package ba.unsa.etf.rpr.domain;

import java.util.Objects;


/**
 *
 * @author Ali Boudellaa
 */


public class Vozila implements Idable {
    private int idVozila, cijenaVozila;
    private String imeVozila, gorivo, bojaVozila;
    private int idVozaca;

    public Vozila(int idVozila, int cijenaVozila, String imeVozila, String gorivo, String bojaVozila, int idVozaca) {
        this.idVozila = idVozila;
        this.cijenaVozila = cijenaVozila;
        this.imeVozila = imeVozila;
        this.gorivo = gorivo;
        this.bojaVozila = bojaVozila;
        this.idVozaca = idVozaca;
    }

    public Vozila() {
    }

    public int getIdVozila() {
        return idVozila;
    }

    public void setIdVozila(int idVozila) {
        this.idVozila = idVozila;
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

    public String getGorivo() {
        return gorivo;
    }

    public void setGorivo(String gorivo) {
        this.gorivo = gorivo;
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
        return getIdVozila() == vozila.getIdVozila() && getCijenaVozila() == vozila.getCijenaVozila() && getIdVozaca() == vozila.getIdVozaca() && Objects.equals(getImeVozila(), vozila.getImeVozila()) && Objects.equals(getGorivo(), vozila.getGorivo()) && Objects.equals(getBojaVozila(), vozila.getBojaVozila());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVozila(), getCijenaVozila(), getImeVozila(), getGorivo(), getBojaVozila(), getIdVozaca());
    }

    @Override
    public String toString() {
        return "Vozila{" +
                "idVozila=" + idVozila +
                ", cijenaVozila=" + cijenaVozila +
                ", imeVozila='" + imeVozila + '\'' +
                ", gorivo='" + gorivo + '\'' +
                ", bojaVozila='" + bojaVozila + '\'' +
                ", idVozaca=" + idVozaca +
                '}';
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public int getId() {
        return 0;
    }
}
