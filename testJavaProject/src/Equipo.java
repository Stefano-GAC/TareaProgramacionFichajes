public class Equipo {
    private String nombreEquipo;
    private String abrevEquipo;

    private Presidente Presidente_id;

    public Equipo(String nombreEquipo, String abrevEquipo, Presidente Presidente_id) {
        this.nombreEquipo = nombreEquipo;
        this.abrevEquipo = abrevEquipo;
        this.Presidente_id = Presidente_id;
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
