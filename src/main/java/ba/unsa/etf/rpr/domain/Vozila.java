package ba.unsa.etf.rpr.domain;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Objects;


/**
 *
 * @author Ali Boudellaa
 */


public class Vozila implements Idable {
    private int id;
    private SimpleIntegerProperty cijenaVozila;
    private SimpleStringProperty imeVozila, bojaVozila;
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
        this.cijenaVozila = new SimpleIntegerProperty(cijenaVozila);
        this.imeVozila = new SimpleStringProperty(imeVozila);
        this.bojaVozila = new SimpleStringProperty(bojaVozila);
        this.vozac = vozac;
    }

    public Vozila() {
        this.cijenaVozila = new SimpleIntegerProperty();
        this.imeVozila = new SimpleStringProperty();
        this.bojaVozila = new SimpleStringProperty();
    }

    public int getCijenaVozila() {
        return cijenaVozila.get();
    }

    public SimpleIntegerProperty cijenaVozilaProperty() {
        return cijenaVozila;
    }

    public void setCijenaVozila(int cijenaVozila) {
        this.cijenaVozila.set(cijenaVozila);
    }

    public String getImeVozila() {
        return imeVozila.get();
    }

    public SimpleStringProperty imeVozilaProperty() {
        return imeVozila;
    }

    public void setImeVozila(String imeVozila) {
        this.imeVozila.set(imeVozila);
    }

    public String getBojaVozila() {
        return bojaVozila.get();
    }

    public SimpleStringProperty bojaVozilaProperty() {
        return bojaVozila;
    }

    public void setBojaVozila(String bojaVozila) {
        this.bojaVozila.set(bojaVozila);
    }

    public Vozaci getVozac() {
        return vozac;
    }

    public void setVozac(Vozaci vozac) {
        this.vozac = vozac;
    }
}
