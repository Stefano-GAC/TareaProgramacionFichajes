
public class Presidente {
    private String Dni;
    private String Nombre;

    public Presidente(String Dni, String Nombre) {
        this.Dni = Dni;
        this.Nombre = Nombre;
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