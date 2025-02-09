import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import Entrenador.Entrenador;
import Entrenador.Formacion;
import Equipo.Equipo;
import Jugador.Jugador;
import Jugador.Posicion;
import Jugador.Traspaso;
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
                Jugador jugador1 = new Jugador("Luis Suárez", new Date(1987, 1, 24), "Uruguay", posicionDelantero, 9,
                                traspasoAprobadoPresidente);
                Jugador jugador2 = new Jugador("Gerard Piqué", new Date(1987, 2, 2), "España", posicionDefensa, -8,
                                traspasoSolicitado);
                Jugador jugador3 = new Jugador("Thibaut Courtois", new Date(1992, 5, 11), "Bélgica", posicionPortero, 1,
                                traspasoRechazadoEntrenador);
                Jugador jugador4 = new Jugador("Leonel Messi", new Date(1984, 5, 26), "Argentina",
                                posicionMedioCampista, 10,
                                traspasoAprobadoPresidente);
                Jugador jugador5 = new Jugador("Stefano Alderete", new Date(2000, 8, 21), "Peru", posicionAguatero, 0,
                                traspasoRechazadoPresidente);
                Jugador jugador6 = new Jugador("Vini Jr", new Date(2000, 6, 21), "Brasil", posicionDelantero, 9,
                                traspasoSolicitado);
                Jugador jugador7 = new Jugador("Van Dijk", new Date(1998, 6, 11), "Paises Bajos", posicionDefensa, 6666,
                                traspasoSinSolicitar);
                Jugador jugador8 = new Jugador("Lamine Yamal", new Date(2006, 9, 25), "España", posicionDelantero, 11,
                                traspasoAprobadoEntrenador);
                Jugador jugador9 = new Jugador("Andres Iniesta", new Date(1889, 7, 1), "España", posicionMedioCampista,
                                8,
                                traspasoRechazadoPresidente);
                Jugador jugador10 = new Jugador("Oblak", new Date(1990, 12, 30), "Eslovenia", posicionPortero, 4,
                                traspasoSinSolicitar);

                /** Creacion de la lista jugadores */
                ArrayList<Jugador> jugadores = new ArrayList<>();
                jugadores.add(jugador1);
                jugadores.add(jugador2);
                jugadores.add(jugador3);
                jugadores.add(jugador4);
                jugadores.add(jugador5);
                jugadores.add(jugador6);
                jugadores.add(jugador7);
                jugadores.add(jugador8);
                jugadores.add(jugador9);
                jugadores.add(jugador10);

                // ArrayList<Jugador> Barcelona = new ArrayList<Jugador>();
                // Barcelona.add(jugador1);
                // Barcelona.add(jugador2);
                // Barcelona.add(jugador8);

                // ArrayList<Jugador> RealMadrid = new ArrayList<Jugador>();
                // RealMadrid.add(jugador3);
                // RealMadrid.add(jugador6);
                // RealMadrid.add(jugador7);

                // ArrayList<Jugador> LosGallitosCuliacan = new ArrayList<Jugador>();
                // LosGallitosCuliacan.add(jugador4);
                // LosGallitosCuliacan.add(jugador5);
                // LosGallitosCuliacan.add(jugador9);
                // LosGallitosCuliacan.add(jugador10);

                System.out.println("hola");
                System.out.println(jugador2.getDorsal());
                System.out.println(presidente1);

        }
}
