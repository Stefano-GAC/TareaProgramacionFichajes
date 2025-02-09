package Entrenador;
import Jugador.Jugador;
import Equipo.Equipo;
import Jugador.Traspaso;

public class Entrenador {
    private String nombreEntrenador;
    private Formacion formacionPreferida;
    private Traspaso Traspaso_jugador;
    private Equipo nombreEquipo;

    public Entrenador(String nombreEntrenador, Formacion formacionPreferida, Equipo nombreEquipo) {
        this.nombreEntrenador = nombreEntrenador;
        this.formacionPreferida = formacionPreferida;
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public Formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    public void entrenadorDecision(Jugador Nombre_camiseta){
        if (Jugador.getTraspaso_jugador == Traspaso.SOLICITADO) {
            if (Jugador.getnombreEquipo != Equipo.getnombreEquipo) {
                
            }
        }
    }

    @Override
    public String toString() {
        return "Entrenador [Nombre= " + nombreEntrenador + "Formación= " + formacionPreferida + "Equipo = "
                + nombreEquipo + "]";
    }
}
