import java.util.ArrayList;

import Jugador.Posicion;
import Jugador.Traspaso;

public class App {
    public static void main(String[] args) {
        /** Creacion de objetos de la clase Presidente */
        Presidente presidente1 = new Presidente("123456789A", "Carlos Martinez");
        Presidente presidente2 = new Presidente("123456789B", "Camila Gonzalez");
        Presidente presidente3 = new Presidente("123456789C", "Jose Rpdriguez");

        /** Creacion de la lista de presidentes */
        ArrayList<Presidente> presidentes = new ArrayList<>();
        presidentes.add(presidente1);
        presidentes.add(presidente2);
        presidentes.add(presidente3);

        /** Creacion de objeto de la clase Posicion y Traspaso */
        Posicion posicionPortero = Posicion.Portero;
        Posicion posicionDefensa = Posicion.Defensa;
        Posicion posicionMedioCampista = Posicion.Medio_Campista;
        Posicion posicionDelantero = Posicion.Delantero;
        Posicion posicionAguatero = Posicion.Aguatero;

        Traspaso traspasoSinSolicitar = Traspaso.SINSOLICITAR;
        Traspaso traspasoSolicitado = Traspaso.SOLICITADO;
        Traspaso traspasoAprobadoEntrenador = Traspaso.APROBADOENTRENADOR;
        Traspaso traspasoAprobadoPresidente = Traspaso.APROBADOPRESIDENTE;
        Traspaso traspasoRechazadoEntrenador = Traspaso.RECHAZADOENTRENADOR;
        Traspaso traspasoRechazadoPresidente = Traspaso.RECHAZADOPRESIDENTE;
    }
}
