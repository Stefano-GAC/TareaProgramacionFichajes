package Presidente;

import Entrenador.Entrenador;
import Equipo.Equipo;
import GestorTraspaso.GestorTraspaso;
import Jugador.Traspaso;
import Jugador.Jugador;
import Trabajador.TipoTrabajador;
import Trabajador.Trabajador;
import Trabajador.TipoTrabajador;
import java.util.Date;

public class Presidente extends Trabajador implements GestorTraspaso {
    private static int contador = 0;

    private String dni;
    private Equipo equipo;

    /**
     * 
     * @param dni    Identificacion del presidente
     * @param nombre Nombre del presidente
     * @param equipo Equipo al que pertenece el presidente
     */
    public Presidente(TipoTrabajador tipoTrabajador,String nombre, Date fechaNacimiento, String paisOrigen, Equipo equi, String dnipo) {
        super(tipoTrabajador, nombre, fechaNacimiento, paisOrigen);
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
    public static int getContador() {
        return contador;
    }

    /**
     * Método para aprobar traspaso específicamente por el presidente
     */
    @Override
    public void aprobarTraspaso(Jugador jugador) {
        if (jugador.getTraspaso() == Traspaso.APROBADOENTRENADOR) {
            if (jugador.getEquipo().equals(this.equipo)) {
                jugador.setTraspaso(Traspaso.APROBADOPRESIDENTE);
                System.out.println("El presidente " + nombre + " ha aprobado el traspaso de " + jugador.getNombre());
            } else {
                rechazarTraspaso(jugador);
            }
        }
    }

    /**
     * Método para rechazar traspaso específicamente por el presidente
     */
    @Override
    public void rechazarTraspaso(Jugador jugador) {
        jugador.setTraspaso(Traspaso.RECHAZADOPRESIDENTE);
        System.out.println("El presidente " + nombre + " ha rechazado el traspaso de " + jugador.getNombre());
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