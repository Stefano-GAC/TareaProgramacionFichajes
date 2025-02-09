package Presidente;

import Equipo.Equipo;
import Jugador.Traspaso;
import Jugador.Jugador;

public class Presidente {
    private String Dni;
    private String Nombre;

    private Equipo nombreEquipo;

    /**
     * 
     * @param Dni          Identificacion del presidente
     * @param Nombre       Nombre del presidente
     * @param nombreEquipo Equipo al que pertenece el presidente
     */
    public Presidente(String Dni, String Nombre, Equipo nombreEquipo) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * 
     * @return muestra la identificacion del presidente
     */
    public String getDni() {
        return Dni;
    }

    /**
     * Pone o modifica el dni del presidente
     * 
     * @param dni
     */
    public void setDni(String dni) {
        Dni = dni;
    }

    /**
     * 
     * @return El nombre del presidente
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Pone o modifica el nombre del presidente
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    /**
     * 
     * @return El nombre del equipo
     */
    public Equipo getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * Pone o modifica el nombre del equipo
     * 
     * @param nombreEquipo
     */
    public void setNombreEquipo(Equipo nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void presidenteDecision(Jugador jugador) {
        if (Jugador.getTraspaso_jugador == Traspaso.APROBADOENTRENADOR) {
            if (Jugador.getnombreEquipo == this.nombreEquipo) {
                jugador.setTraspaso_jugador(Traspaso.APROBADOPRESIDENTE);
            } else {
                if (Jugador.getnombreEquipo != this.nombreEquipo) {
                    jugador.setTraspaso_jugador(Traspaso.RECHAZADOPRESIDENTE);
                }
            }
        }

    }

    /**
     * Metodo toString que permite mostrar la información en la clase presidente
     */
    @Override
    public String toString() {
        return "Presidente [Dni= " + Dni + "Nombre= " + Nombre + "Equipo= " + nombreEquipo + "]";
    }
}