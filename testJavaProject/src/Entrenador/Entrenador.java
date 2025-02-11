package Entrenador;

import Jugador.Jugador;
import Equipo.Equipo;
import Jugador.Traspaso;

public class Entrenador {
    private String nombreEntrenador;
    private Formacion formacionPreferida;
    private Traspaso traspasoJugador;
    private Equipo equipo;

    /**
     * Constructor de Entrnador
     * 
     * @param nombreEntrenador
     * @param formacionPreferida
     * @param equipo
     */
    public Entrenador(String nombreEntrenador, Formacion formacionPreferida, Equipo equipo) {
        this.nombreEntrenador = nombreEntrenador;
        this.formacionPreferida = formacionPreferida;
        this.equipo = equipo;
    }

    /**
     * 
     * @return El nombre del entrenador
     */
    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    /**
     * Pone o modifica el nombre del entrenador
     * 
     * @param nombreEntrenador
     */
    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
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

    public void entrenadorDecision(Jugador jugador) {
        if (jugador.getTraspaso() == Traspaso.SOLICITADO) {
            if (jugador.getEquipo().equals(this.equipo)) {
                jugador.setTraspaso(Traspaso.APROBADOENTRENADOR);
                System.out.println("El nuevo estado del traspaso es: " + jugador.getTraspaso()
                        + "despues del aprobado de " + nombreEntrenador);
            } else {
                if (!jugador.getEquipo().equals(this.equipo)) {
                    jugador.setTraspaso(Traspaso.RECHAZADOENTRENADOR);
                }

            }
        }
    }

    /**
     * Metodo toString que permite mostrar los datos de la clase Entrenador
     */
    @Override
    public String toString() {
        return "Entrenador [Nombre= " + nombreEntrenador + "Formación= " + formacionPreferida + "Equipo = "
                + equipo + "]";
    }
}
