package Entrenador;

import Jugador.Jugador;
import Equipo.Equipo;
import GestorTraspaso.GestorTraspaso;
import Jugador.Traspaso;
import Presidente.Presidente;
import Trabajador.TipoTrabajador;
import Trabajador.Trabajador;
import java.util.Date;

public class Entrenador extends Trabajador implements GestorTraspaso {
    private static int contador = 0;

    private Formacion formacionPreferida;
    private Traspaso traspasoJugador;
    private Equipo equipo;

    /**
     * Constructor de Entrnador
     * 
     * @param nombre
     * @param formacionPreferida
     * @param equipo
     */
    public Entrenador(TipoTrabajador tipoTrabajador, String nombre, Date fechaNacimiento, String paisOrigen, Formacion formacionPreferida, Equipo equipo) {
        super(tipoTrabajador, nombre, fechaNacimiento, paisOrigen);
        this.formacionPreferida = formacionPreferida;
        this.equipo = equipo;
        contador++;
    }

    /**
     * 
     * @return muestra la formacion elegida por un Entrenador
     */
    public Formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    /**
     * Pone o modifica la formacion de un entrenador para un equipo
     * 
     * @param formacionPreferida
     */
    public void setFormacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    /**
     * 
     * @return contadir de los entrenadores
     */
    public static int getContador() {
        return contador;
    }

    @Override
    public void aprobarTraspaso(Jugador jugador) {
        if (jugador.getTraspaso() == Traspaso.SOLICITADO) {
            if (jugador.getEquipo().equals(this.equipo)) {
                jugador.setTraspaso(Traspaso.APROBADOENTRENADOR);
                System.out.println("El entrenador " + nombre + " ha aprobado el traspaso de " + jugador.getNombre());
            } else {
                rechazarTraspaso(jugador);
            }
        }
    }

    @Override
    public void rechazarTraspaso(Jugador jugador) {
        jugador.setTraspaso(Traspaso.RECHAZADOENTRENADOR);
        System.out.println("El entrenador " + nombre + " ha rechazado el traspaso de " + jugador.getNombre());
    }

    /**
     * Metodo toString que permite mostrar los datos de la clase Entrenador
     */
    @Override
    public String toString() {
        return "Entrenador [Nombre= " + nombre + "Formación= " + formacionPreferida + "Equipo = "
                + equipo + "]";
    }

    /**
     * Metodo que muestra la información del trabajador
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Tipo: " + tipoTrabajador);
    }
}
