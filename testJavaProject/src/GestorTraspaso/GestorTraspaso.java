package GestorTraspaso;

import Jugador.Jugador;

public interface GestorTraspaso {

    /**
     * 
     * @param jugador
     *                Métodos aprobar y rechazar traspaso de un equipo para ser
     *                usado por presidente y entrenador
     */
    public void aprobarTraspaso(Jugador jugador);

    public void rechazarTraspaso(Jugador jugador);

}
