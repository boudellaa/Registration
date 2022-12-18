package ba.unsa.etf.rpr.domain;

public class Vozila {
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
    public Vozila(){
        this.idVozila = 0;
        this.cijenaVozila = 0;
        this.imeVozila = "";
        this.gorivo = "";
        this.bojaVozila = "";
        this.idVozaca = 0;
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
}
