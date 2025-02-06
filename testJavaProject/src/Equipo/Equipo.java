package Equipo;

public class Equipo {
    private String nombreEquipo;
    private String abrevEquipo;

    public Equipo(String nombreEquipo, String abrevEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.abrevEquipo = abrevEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getAbrevEquipo() {
        return abrevEquipo;
    }

    public void setAbrevEquipo(String abrevEquipo) {
        this.abrevEquipo = abrevEquipo;
    }

    @Override
    public String toString() {
        return "Equipo [Nombre= " + nombreEquipo + "Abraviatura= " + abrevEquipo + "]";
    }
}
