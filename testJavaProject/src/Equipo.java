public class Equipo {
    public String nombreEquipo;
    public String abrevEquipo;

    public Equipo(String nombreEquipo, String abrevEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.abrevEquipo = abrevEquipo;
    }

    public String getNombreEquipo() {
        if (nombreEquipo == null) {
            System.out.println("Ingrese un nombre valido");
        }
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
