package Presidente;

import Equipo.Equipo;
import Jugador.Traspaso;
import Jugador.Jugador;

public class Presidente {
    private String Dni;
    private String Nombre;
    private Equipo equipo;

    /**
     * 
     * @param Dni    Identificacion del presidente
     * @param Nombre Nombre del presidente
     * @param equipo Equipo al que pertenece el presidente
     */
    public Presidente(String Dni, String Nombre, Equipo equipo) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.equipo = equipo;
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
                System.out.println("El nuevo estado del traspaso es: " + jugador.getTraspaso());
            } else {
                if (jugador.getEquipo() != this.equipo) {
                    jugador.setTraspaso(Traspaso.RECHAZADOPRESIDENTE);
                    System.out.println("El nuevo estado del traspaso es: " + jugador.getTraspaso());
                }
            }
        }

    }

    /**
     * Metodo toString que permite mostrar la información en la clase presidente
     */
    @Override
    public String toString() {
        return "Presidente [Dni= " + Dni + "Nombre= " + Nombre + "Equipo= " + equipo + "]";
    }
}