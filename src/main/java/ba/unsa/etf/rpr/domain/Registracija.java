package ba.unsa.etf.rpr.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Ali Boudellaa
 */

public class Registracija implements Idable{
    private int id;
    private LocalDate datum;
    private Vozila vozilo;


    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    public Registracija(int id, LocalDate datum, Vozila vozilo) {
        this.id = id;
        this.datum = datum;
        this.vozilo = vozilo;
    }

    public Registracija() {
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
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
        return getId() == that.getId() && Objects.equals(getDatum(), that.getDatum()) && Objects.equals(getVozilo(), that.getVozilo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDatum(), getVozilo());
    }

    @Override
    public String toString() {
        return "Registracija{" +
                "id=" + id +
                ", datum=" + datum +
                ", vozilo=" + vozilo +
                '}';
    }
}
