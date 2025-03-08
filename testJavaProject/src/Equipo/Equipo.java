package Equipo;

import java.util.ArrayList;

import Jugador.Jugador;

public class Equipo {
    private static int contador = 0;

    private String nombreEquipo;
    private String abrevEquipo;
    private ArrayList<Jugador> jugadores;

    /**
     * Relacion lista de Jugadores en Equipos
     */

    private ArrayList<Jugador> listaJugadores;

    /**
     * Constructor no incluye jugadores
     * 
     * @param nombreEquipo
     * @param abrevEquipo
     */

    public Equipo(String nombreEquipo, String abrevEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.abrevEquipo = abrevEquipo;
        this.jugadores = new ArrayList<>();
        contador++;
    }

    /**
     * Constructor incluye la lista de jugadores
     * 
     * @param nombreEquipo
     * @param abrevEquipo
     * @param listaJugadores
     */

    public Equipo(String nombreEquipo, String abrevEquipo, ArrayList<Jugador> listaJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.abrevEquipo = abrevEquipo;
        this.listaJugadores = listaJugadores;
    }

    /**
     * 
     * @return Nombre del equipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * Pone o modifica el nombre del equipo
     * 
     * @param nombreEquipo
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * 
     * @return Abreviatura del equipo
     */
    public String getAbrevEquipo() {
        return abrevEquipo;
    }

    /**
     * Pone o modifica la abreviatura del equipo
     * 
     * @param abrevEquipo
     */
    public void setAbrevEquipo(String abrevEquipo) {
        this.abrevEquipo = abrevEquipo;
    }

    /**
     * 
     * @return la lista completa de los jugadores de un equipo
     */
    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    /**
     * pone o modifica la lista completa de los jugadores de un equipo
     * 
     * @param listaJugadores
     */
    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    /**
     * Metodo para el movimiento luego del traspaso
     * Elimina el jugador de su equipo actual.
     */
    public boolean eliminarJugador(Jugador jugador) {
        return listaJugadores.remove(jugador);
    }

    /**
     * Añade el jugador al nuevo equipo.
     */
    public void agregarJugador(Jugador jugador) {
        listaJugadores.add(jugador);
        jugador.setEquipo(this);
    }

    /**
     * 
     * @return contador de los equipos
     */
    public static int getContador() {
        return contador;
    }

    /**
     * Método toString para poder imprimir la información de la clase Equipo
     */
    @Override
    public String toString() {
        return "Equipo [nombreEquipo=" + nombreEquipo + ", abrevEquipo=" + abrevEquipo + ", listaJugadores="
                + jugadores.size() + "]";
    }
}
