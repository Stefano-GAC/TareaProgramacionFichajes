package Presidente;

import Entrenador.Entrenador;
import Equipo.Equipo;
import Jugador.Traspaso;
import Jugador.Jugador;
import Trabajador.TipoTrabajador;
import Trabajador.Trabajador;
import Trabajador.TipoTrabajador;

public class Presidente extends Trabajador{
    private static int contador = 0;

    private String dni;
    private Equipo equipo;

    /**
     * 
     * @param dni    Identificacion del presidente
     * @param nombre Nombre del presidente
     * @param equipo Equipo al que pertenece el presidente
     */
    public Presidente(TipoTrabajador tipoTrabajador, String dni, String nombre, Equipo equipo) {
        super(tipoTrabajador, nombre);
        this.dni = dni;
        this.equipo = equipo;
        contador++;
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

    /**
     * 
     * @return el contador de los presidentes
     */
    public static int getContador(){
        return contador;
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
    /**
     * Metodo que muestra la información del trabajador
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Tipo: " + tipoTrabajador);
    }
}