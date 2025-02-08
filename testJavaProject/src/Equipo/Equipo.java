package Equipo;

import Entrenador.Entrenador;
import Presidente.Presidente;

public class Equipo {
    private String nombreEquipo;
    private String abrevEquipo;

    private Entrenador nombreEntrenador;
    private Presidente nombrePresidente;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombreEquipo, String abrevEquipo, Entrenador nombreEntrenador, Presidente nombrePresidente) {
        this.nombreEquipo = nombreEquipo;
        this.abrevEquipo = abrevEquipo;

        this.nombreEntrenador = nombreEntrenador;
        this.nombrePresidente = nombrePresidente;

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
