import java.sql.Date;
import java.util.ArrayList;

import Entrenador.Entrenador;
import Entrenador.Formacion;
import Equipo.Equipo;
import Jugador.Jugador;
import Jugador.Posicion;
import Presidente.Presidente;

public class App {
        public static void main(String[] args) {

                /** Creacion de objetos de la clase Equipo */
                Equipo equipo1 = new Equipo("Barcelona", "FCB");
                Equipo equipo2 = new Equipo("Real Madrid", "RMD");
                Equipo equipo3 = new Equipo("Atletico de Madrid", "ATM");

                /** Creacion de objetos de la clase Presidente */
                Presidente presidente1 = new Presidente("123456789A", "Carlos Martinez", equipo1);
                Presidente presidente2 = new Presidente("123456789B", "Camila Gonzalez", equipo2);
                Presidente presidente3 = new Presidente("123456789C", "Jose Rpdriguez", equipo3);

                /** Creacion de objetos de la clase Entrenador */
                Entrenador entrenador1 = new Entrenador("Carlo Ancelotti", Formacion.Formacion343, equipo1);
                Entrenador entrenador2 = new Entrenador("Hansi Flick", Formacion.Formacion4141, equipo2);
                Entrenador entrenador3 = new Entrenador("Diego Simeone", Formacion.Formacion433, equipo3);

                /** Creacion de objeto de la clase Posicion y Traspaso */
                // Posicion posicionPortero = Posicion.Portero;
                // Posicion posicionDefensa = Posicion.Defensa;
                // Posicion posicionMedioCampista = Posicion.Medio_Campista;
                // Posicion posicionDelantero = Posicion.Delantero;
                // Posicion posicionAguatero = Posicion.Aguatero;

                // Traspaso traspasoSinSolicitar = Traspaso.SINSOLICITAR;
                // Traspaso traspasoSolicitado = Traspaso.SOLICITADO;
                // Traspaso traspasoAprobadoEntrenador = Traspaso.APROBADOENTRENADOR;
                // Traspaso traspasoAprobadoPresidente = Traspaso.APROBADOPRESIDENTE;
                // Traspaso traspasoRechazadoEntrenador = Traspaso.RECHAZADOENTRENADOR;
                // Traspaso traspasoRechazadoPresidente = Traspaso.RECHAZADOPRESIDENTE;

                /** Creacion de objetos de la clase Jugador */
                Jugador jugador1 = new Jugador("Luis Suárez", new Date(1987, 1, 24), "Uruguay", Posicion.Delantero, 9,
                                null);
                Jugador jugador2 = new Jugador("Gerard Piqué", new Date(1987, 2, 2), "España", Posicion.Defensa, 8,
                                null);
                Jugador jugador3 = new Jugador("Thibaut Courtois", new Date(1992, 5, 11), "Bélgica", Posicion.Portero,
                                1, null);
                Jugador jugador4 = new Jugador("Leonel Messi", new Date(1984, 5, 26), "Argentina",
                                Posicion.Medio_Campista, 10, null);
                Jugador jugador5 = new Jugador("Stefano Alderete", new Date(2000, 8, 21), "Peru", Posicion.Aguatero, 0,
                                null);
                Jugador jugador6 = new Jugador("Vini Jr", new Date(2000, 6, 21), "Brasil", Posicion.Delantero, 9, null);
                Jugador jugador7 = new Jugador("Van Dijk", new Date(1998, 6, 11), "Paises Bajos", Posicion.Defensa,
                                6666, null);
                Jugador jugador8 = new Jugador("Lamine Yamal", new Date(2006, 9, 25), "España", Posicion.Delantero, 11,
                                null);
                Jugador jugador9 = new Jugador("Andres Iniesta", new Date(1889, 7, 1), "España",
                                Posicion.Medio_Campista, 8, null);

                /** Creacion de la lista jugadores equipo 1 */
                ArrayList<Jugador> jugadores1 = new ArrayList<>();
                jugadores1.add(jugador1);
                jugadores1.add(jugador2);
                jugadores1.add(jugador3);

                /** Creacion de la lista jugadores equipo 2 */
                ArrayList<Jugador> jugadores2 = new ArrayList<>();
                jugadores2.add(jugador4);
                jugadores2.add(jugador5);
                jugadores2.add(jugador6);

                /** Creacion de la lista jugadores equipo 3 */
                ArrayList<Jugador> jugadores3 = new ArrayList<>();
                jugadores3.add(jugador7);
                jugadores3.add(jugador8);
                jugadores3.add(jugador9);

                equipo1.setListaJugadores(jugadores1);
                equipo2.setListaJugadores(jugadores2);
                equipo1.setListaJugadores(jugadores3);

                System.out.println(equipo1);

        }
}