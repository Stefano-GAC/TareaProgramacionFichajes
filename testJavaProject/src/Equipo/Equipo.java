package Equipo;

import java.util.ArrayList;

import Entrenador.Entrenador;
import Jugador.Jugador;
import Presidente.Presidente;

public class Equipo {

    private String nombreEquipo;
    private String abrevEquipo;

    private ArrayList<Jugador> listaJugadores;

    public Equipo(String nombreEquipo, String abrevEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.abrevEquipo = abrevEquipo;
    }

    public Equipo(String nombreEquipo, String abrevEquipo, ArrayList<Jugador> listaJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.abrevEquipo = abrevEquipo;
        this.listaJugadores = listaJugadores;
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

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return "Equipo [nombreEquipo=" + nombreEquipo + ", abrevEquipo=" + abrevEquipo + ", listaJugadores="
                + listaJugadores + "]";
    }
}
