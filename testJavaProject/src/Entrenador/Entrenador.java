package Entrenador;

import Jugador.Jugador;
import Equipo.Equipo;
import Jugador.Traspaso;
import Presidente.Presidente;
import Trabajador.TipoTrabajador;
import Trabajador.Trabajador;

public class Entrenador extends Trabajador {
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
    public Entrenador(TipoTrabajador tipoTrabajador, String nombre, Formacion formacionPreferida, Equipo equipo) {
        super(tipoTrabajador, nombre);
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

    public void entrenadorDecision(Jugador jugador) {
        if (jugador.getTraspaso() == Traspaso.SOLICITADO) {
            if (jugador.getEquipo().equals(this.equipo)) {
                jugador.setTraspaso(Traspaso.APROBADOENTRENADOR);
                System.out.println("El nuevo estado del traspaso es: " + jugador.getTraspaso()
                        + " despues del aprobado de " + nombre);
            } else {
                jugador.setTraspaso(Traspaso.RECHAZADOENTRENADOR);
                System.out.println("El nuevo estado del traspaso es: " + jugador.getTraspaso()
                        + " despues del rechazo de " + nombre);

            }

        }
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
