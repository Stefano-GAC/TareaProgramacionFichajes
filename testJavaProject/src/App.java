
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

import Entrenador.Entrenador;
import Entrenador.Formacion;
import Equipo.Equipo;
import Jugador.Jugador;
import Jugador.Posicion;
import Jugador.Traspaso;
import Presidente.Presidente;
import Trabajador.Trabajador;

public class App {
        public static void main(String[] args) {

                /**
                 * Creacion de objetos de la clase Equipo
                 */
                Equipo equipo1 = new Equipo("Barcelona", "FCB");
                Equipo equipo2 = new Equipo("Real Madrid", "RMD");
                Equipo equipo3 = new Equipo("Atletico de Madrid", "ATM");

                /**
                 * Creacion de objetos de la clase Presidente
                 */
                Presidente presidente1 = new Presidente("123456789A", "Carlos Martinez", equipo1);
                Presidente presidente2 = new Presidente("123456789B", "Camila Gonzalez", equipo2);
                Presidente presidente3 = new Presidente("123456789C", "Jose Rpdriguez", equipo3);

                /**
                 * Creacion de objetos de la clase Entrenador
                 */
                Entrenador entrenador1 = new Entrenador("Carlo Ancelotti", Formacion.Formacion343, equipo1);
                Entrenador entrenador2 = new Entrenador("Hansi Flick", Formacion.Formacion4141, equipo2);
                Entrenador entrenador3 = new Entrenador("Diego Simeone", Formacion.Formacion433, equipo3);

                /**
                 * Creacion de objetos de la clase Jugador
                 */
                Jugador jugador1 = new Jugador("Luis Suárez", new Date(1994, 1, 12), "Uruguay", "Suarez",
                                Posicion.Delantero, 9,
                                Traspaso.SINSOLICITAR);
                Jugador jugador2 = new Jugador("Gerard Piqué", new Date(1987, 2, 2), "España", "Piqué",
                                Posicion.Defensa,
                                8,
                                Traspaso.SINSOLICITAR);
                Jugador jugador3 = new Jugador("Thibaut Courtois", new Date(1992, 5, 11), "Bélgica", "Courtois",
                                Posicion.Portero,
                                1, Traspaso.SINSOLICITAR);
                Jugador jugador4 = new Jugador("Leonel Messi", new Date(1984, 5, 26), "Argentina",
                                "Messi", Posicion.Medio_Campista, 10, Traspaso.SINSOLICITAR);
                Jugador jugador5 = new Jugador("Stefano Alderete", new Date(2000, 8, 21), "Peru", "Gonzalo",
                                Posicion.Aguatero, 0,
                                Traspaso.SINSOLICITAR);
                Jugador jugador6 = new Jugador("Vinicious Junior", new Date(2000, 6, 21), "Brasil", "Vini Jr",
                                Posicion.Delantero, 9,
                                Traspaso.SINSOLICITAR);
                Jugador jugador7 = new Jugador("Van Dijk", new Date(1998, 6, 11), "Paises Bajos", "Virgil",
                                Posicion.Defensa,
                                6666, Traspaso.SINSOLICITAR);
                Jugador jugador8 = new Jugador("Lamine Yamal", new Date(2006, 9, 25), "España", "Yamal",
                                Posicion.Delantero, 11,
                                Traspaso.SINSOLICITAR);
                Jugador jugador9 = new Jugador("Andres Iniesta", new Date(1889, 7, 1), "España",
                                "Iniesta", Posicion.Medio_Campista, 8, Traspaso.SINSOLICITAR);

                /**
                 * Creacion de la lista jugadores equipo 1
                 */
                ArrayList<Jugador> jugadores1 = new ArrayList<>();
                jugadores1.add(jugador1);
                jugadores1.add(jugador2);
                jugadores1.add(jugador3);

                /**
                 * Creacion de la lista jugadores equipo 2
                 */
                ArrayList<Jugador> jugadores2 = new ArrayList<>();
                jugadores2.add(jugador4);
                jugadores2.add(jugador5);
                jugadores2.add(jugador6);

                /**
                 * Creacion de la lista jugadores equipo 3
                 */
                ArrayList<Jugador> jugadores3 = new ArrayList<>();
                jugadores3.add(jugador7);
                jugadores3.add(jugador8);
                jugadores3.add(jugador9);

                /**
                 * Se asignan las listas d los jugadores a los equipos
                 */
                equipo1.setListaJugadores(jugadores1);
                equipo2.setListaJugadores(jugadores2);
                equipo3.setListaJugadores(jugadores3);

                /**
                 * Se asignan los equipos a los jugadores
                 */
                jugador1.setEquipo(equipo1);
                jugador2.setEquipo(equipo1);
                jugador3.setEquipo(equipo1);
                jugador4.setEquipo(equipo2);
                jugador5.setEquipo(equipo2);
                jugador6.setEquipo(equipo2);
                jugador7.setEquipo(equipo3);
                jugador8.setEquipo(equipo3);
                jugador9.setEquipo(equipo3);

                /**
                 * Prueba de los toString
                 */
                System.out.println("PRÁCTICA 5");
                System.out.println("Los Jugadores del Barcelona son:");
                int contador = 1;
                for (Jugador jugador : jugadores1) {
                        System.out.println(contador + ". " + jugador);
                        contador++;
                }

                System.out.println("----------------------------");

                System.out.println("El presidente del Real Madrid es:" + presidente2);

                System.out.println("----------------------------");

                System.out.println("El entrenador del Atlético de Madrid es:" + entrenador3);

                System.out.println("-------------------------");

                /**
                 * Metodos para realizar el Traspaso
                 */
                System.out.println("TRASPASO 1: jugador con entrenador y presidente del mismo equipo: \n");

                jugador3.jugadorTraspaso();
                System.out.println("La solicitud ha pasado al entrenador:" + entrenador1.getNombreEntrenador());
                entrenador1.entrenadorDecision(jugador3);
                System.out.println("La solicitud ha pasado al presidente:" + presidente1.getNombre());
                presidente1.presidenteDecision(jugador3);
                jugador3.moverJugador(equipo2);

                System.out.println("-------------------------");

                System.out.println("TRASPASO 2: jugador con entrenador de diferente equipo rechazado: \n");

                jugador5.jugadorTraspaso();
                System.out.println("La solicitud ha pasado al entrenador:" + entrenador3.getNombreEntrenador());
                entrenador3.entrenadorDecision(jugador5);
                System.out.println("La solicitud ha pasado al presidente:" + presidente3.getNombre());
                presidente3.presidenteDecision(jugador5);
                jugador5.moverJugador(equipo3);

                System.out.println("-------------------------");

                System.out.println(
                                "TRASPASO 3: jugador con entrenador del mismo equipo , pero con presidente de equipo diferente: \n");
                jugador8.jugadorTraspaso();
                System.out.println("La solicitud ha pasado al entrenador:" + entrenador3.getNombreEntrenador());
                entrenador3.entrenadorDecision(jugador8);
                System.out.println("La solicitud ha pasado al presidente:" + presidente1.getNombre());
                presidente1.presidenteDecision(jugador8);
                jugador8.moverJugador(equipo1);

                System.out.println("-------------------------");

                System.out.println("Total jugadores creados: " + Jugador.getContador());
                System.out.println("Total entrenadores creados: " + Entrenador.getContador());
                System.out.println("Total equipos creados: " + Equipo.getContador());
                System.out.println("Total presidentes creados: " + Presidente.getContador());

                System.out.println("-------------------------");
                System.out.println("PRÁCTICA 6");

                System.out.println(jugador1.comparaNacionalidad(jugador2));
                System.out.println(jugador8.comparaNacionalidad(jugador9));

        }

}