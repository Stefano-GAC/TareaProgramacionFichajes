import Equipo.Equipo;

public class Presidente {
    private String Dni;
    private String Nombre;

    private Equipo nombreEquipo;

    public Presidente(String Dni, String Nombre, Equipo nombrEquipo) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.nombreEquipo = nombreEquipo;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Presidente [Dni= " + Dni + "Nombre= " + Nombre + "]";
    }
}