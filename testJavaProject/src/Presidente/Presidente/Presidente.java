package Presidente;

import Equipo.Equipo;
import Jugador.Traspaso;
import Jugador.Jugador;

public class Presidente {
    private String dni;
    private String nombre;
    private Equipo equipo;

    /**
     * 
     * @param dni    Identificacion del presidente
     * @param nombre Nombre del presidente
     * @param equipo Equipo al que pertenece el presidente
     */
    public Presidente(String dni, String nombre, Equipo equipo) {
        this.dni = dni;
        this.nombre = nombre;
        this.equipo = equipo;
    }

    /**
     * 
     * @return muestra la identificacion del presidente
     */
    public String getDni() {
        return dni;
    }

    /**
     * Pone o modifica el dni del presidente
     * 
     * @param dni
     */
    public void setDni(String dni) {
        dni = dni;
    }

    /**
     * 
     * @return El nombre del presidente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Pone o modifica el nombre del presidente
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        nombre = nombre;
    }

    /**
     * 
     * @return El nombre del equipo
     */
    public Equipo getequipo() {
        return equipo;
    }

    /**
     * Pone o modifica el nombre del equipo
     * 
     * @param equipo
     */
    public void setequipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void presidenteDecision(Jugador jugador) {
        if (jugador.getTraspaso() == Traspaso.APROBADOENTRENADOR) {
            if (jugador.getEquipo().equals(this.equipo)) {
                jugador.setTraspaso(Traspaso.APROBADOPRESIDENTE);
                System.out.println("El nuevo estado del traspaso es: " + jugador.getTraspaso()
                        + " despues del aprobado del presidente " + nombre);
            } else {
                jugador.setTraspaso(Traspaso.RECHAZADOPRESIDENTE);
                System.out.println("El nuevo estado del traspaso es: " + jugador.getTraspaso()
                        + "despues de la negativa de " + nombre);
            }
        }
        if ((jugador.getTraspaso() == Traspaso.APROBADOPRESIDENTE)
                || (jugador.getTraspaso() == Traspaso.RECHAZADOPRESIDENTE)
                || (jugador.getTraspaso() == Traspaso.RECHAZADOENTRENADOR)) {
        }
    }

    /**
     * Metodo toString que permite mostrar la información en la clase presidente
     */
    @Override
    public String toString() {
        return "Presidente [Dni= " + dni + "Nombre= " + nombre + "Equipo= " + equipo + "]";
    }
}