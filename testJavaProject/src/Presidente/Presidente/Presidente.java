package Presidente;

import Equipo.Equipo;

public class Presidente {
    private String Dni;
    private String Nombre;

    private Equipo nombreEquipo;

    public Presidente(String Dni, String Nombre, Equipo nombreEquipo) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.nombreEquipo = nombreEquipo;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Equipo getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(Equipo nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String toString() {
        return "Presidente [Dni= " + Dni + "Nombre= " + Nombre + "Equipo= " + nombreEquipo + "]";
    }
}