package Entrenador;

import Jugador.Jugador;
import Equipo.Equipo;
import Jugador.Traspaso;

public class Entrenador {
    private String nombreEntrenador;
    private Formacion formacionPreferida;
    private Traspaso Traspaso_jugador;
    private Equipo nombreEquipo;

    /**
     * Constructor de Entrnador
     * 
     * @param nombreEntrenador
     * @param formacionPreferida
     * @param nombreEquipo
     */
    public Entrenador(String nombreEntrenador, Formacion formacionPreferida, Equipo nombreEquipo) {
        this.nombreEntrenador = nombreEntrenador;
        this.formacionPreferida = formacionPreferida;
        this.nombreEquipo = nombreEquipo;
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

    /**
     * 
     * @param Nombre_camiseta Jugador que solicitará el cambio
     * 
     *                        Metodo que verifica el estado actual del traspaso de
     *                        un jugador y lo compara con el estado "Solicitado",
     *                        para mantenerlo o igualarlo.
     */
    public void entrenadorDecision(Jugador Nombre_camiseta) {
        if (Jugador.getTraspaso_jugador == Traspaso.SOLICITADO) {
            if (Jugador.getnombreEquipo == this.nombreEquipo) {

            }
        }
    }

    /**
     * Metodo toString que permite mostrar los datos de la clase Entrenador
     */
    @Override
    public String toString() {
        return "Entrenador [Nombre= " + nombreEntrenador + "Formación= " + formacionPreferida + "Equipo = "
                + nombreEquipo + "]";
    }
}
