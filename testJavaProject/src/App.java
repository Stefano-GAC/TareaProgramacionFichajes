
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import Entrenador.Entrenador;
import Entrenador.Formacion;
import Equipo.Equipo;
import Jugador.Jugador;
import Jugador.Posicion;
import Jugador.Traspaso;
import Presidente.Presidente;
import Trabajador.Trabajador;
import Trabajador.TipoTrabajador;

public class App {
        public static void main(String[] args) {

                /**
                 * Creacion de objetos de la clase Equipo
                 */
                Equipo equipo1 = new Equipo("Barcelona", "FCB");
                Equipo equipo2 = new Equipo("Real Madrid", "RMD");
                Equipo equipo3 = new Equipo("Atletico de Madrid", "ATM");

                /**
                 * Creación de fechas para los presidentes
                 */
                Calendar cal1 = Calendar.getInstance();
                cal1.set(1995, Calendar.AUGUST, 3);
                Date fechaPresidente1 = cal1.getTime();

                Calendar cal2 = Calendar.getInstance();
                cal2.set(1986, Calendar.FEBRUARY, 1);
                Date fechaPresidente2 = cal2.getTime();

                Calendar cal3 = Calendar.getInstance();
                cal3.set(1993, Calendar.JUNE, 12);
                Date fechaPresidente3 = cal3.getTime();

                /**
                 * Creacion de objetos de la clase Presidente
                 */
                Presidente presidente1 = new Presidente(TipoTrabajador.Presidente, "123456789A", fechaPresidente1,
                                "Carlos Martinez",
                                equipo1, "A9875155");
                Presidente presidente2 = new Presidente(TipoTrabajador.Presidente, "123456789B", fechaPresidente2,
                                "Camila Gonzalez",
                                equipo2, "B6168651");
                Presidente presidente3 = new Presidente(TipoTrabajador.Presidente, "123456789C", fechaPresidente3,
                                "Jose Rpdriguez",
                                equipo3, "C8961456");

                /**
                 * Creación de fechas para los entrenadores
                 */
                Calendar cal4 = Calendar.getInstance();
                cal4.set(1980, Calendar.DECEMBER, 20);
                Date fechaEntrenador1 = cal4.getTime();

                Calendar cal5 = Calendar.getInstance();
                cal5.set(1990, Calendar.OCTOBER, 9);
                Date fechaEntrenador2 = cal5.getTime();

                Calendar cal6 = Calendar.getInstance();
                cal6.set(1985, Calendar.FEBRUARY, 15);
                Date fechaEntrenador3 = cal6.getTime();

                /**
                 * Creacion de objetos de la clase Entrenador
                 */
                Entrenador entrenador1 = new Entrenador(TipoTrabajador.Entrenador, "Carlo Ancelotti",
                                fechaEntrenador1, "España", Formacion.Formacion343, equipo1);
                Entrenador entrenador2 = new Entrenador(TipoTrabajador.Entrenador, "Hansi Flick",
                                fechaEntrenador2, "Paises bajos", Formacion.Formacion4141, equipo2);
                Entrenador entrenador3 = new Entrenador(TipoTrabajador.Entrenador, "Diego Simeone",
                                fechaEntrenador3, "España", Formacion.Formacion433, equipo3);

                /**
                 * Creación de fechas para los entrenadores
                 */
                Calendar cal7 = Calendar.getInstance();
                cal7.set(1994, Calendar.JANUARY, 12);
                Date fechaJugador1 = cal7.getTime();

                Calendar cal8 = Calendar.getInstance();
                cal8.set(1987, Calendar.FEBRUARY, 2);
                Date fechaJugador2 = cal8.getTime();

                Calendar cal9 = Calendar.getInstance();
                cal9.set(1992, Calendar.MAY, 11);
                Date fechaJugador3 = cal9.getTime();

                Calendar cal10 = Calendar.getInstance();
                cal10.set(1984, Calendar.JUNE, 26);
                Date fechaJugador4 = cal10.getTime();

                Calendar cal11 = Calendar.getInstance();
                cal11.set(2000, Calendar.AUGUST, 21);
                Date fechaJugador5 = cal11.getTime();

                Calendar cal12 = Calendar.getInstance();
                cal12.set(2000, Calendar.JUNE, 21);
                Date fechaJugador6 = cal12.getTime();

                Calendar cal13 = Calendar.getInstance();
                cal13.set(1998, Calendar.JUNE, 11);
                Date fechaJugador7 = cal13.getTime();

                Calendar cal14 = Calendar.getInstance();
                cal14.set(2006, Calendar.SEPTEMBER, 25);
                Date fechaJugador8 = cal14.getTime();

                Calendar cal15 = Calendar.getInstance();
                cal15.set(1984, Calendar.JULY, 1);
                Date fechaJugador9 = cal15.getTime();

                /**
                 * Creacion de objetos de la clase Jugador
                 */
                Jugador jugador1 = new Jugador(TipoTrabajador.Jugador, "Luis Suárez", fechaJugador1, "Uruguay",
                                "Suarez", Posicion.Delantero, 9, Traspaso.SINSOLICITAR);
                Jugador jugador2 = new Jugador(TipoTrabajador.Jugador, "Gerard Piqué", fechaJugador2, "España",
                                "Piqué", Posicion.Defensa, 8, Traspaso.SINSOLICITAR);
                Jugador jugador3 = new Jugador(TipoTrabajador.Jugador, "Thibaut Courtois", fechaJugador3, "Bélgica",
                                "Courtois", Posicion.Portero, 1, Traspaso.SINSOLICITAR);
                Jugador jugador4 = new Jugador(TipoTrabajador.Jugador, "Leonel Messi", fechaJugador4, "Argentina",
                                "Messi", Posicion.Medio_Campista, 10, Traspaso.SINSOLICITAR);
                Jugador jugador5 = new Jugador(TipoTrabajador.Jugador, "Stefano Alderete", fechaJugador5, "Peru",
                                "Gonzalo", Posicion.Aguatero, 0, Traspaso.SINSOLICITAR);
                Jugador jugador6 = new Jugador(TipoTrabajador.Jugador, "Vinicious Junior", fechaJugador6,
                                "Brasil", "Vini Jr", Posicion.Delantero, 9, Traspaso.SINSOLICITAR);
                Jugador jugador7 = new Jugador(TipoTrabajador.Jugador, "Van Dijk", fechaJugador7, "Paises Bajos",
                                "Virgil", Posicion.Defensa, 6666, Traspaso.SINSOLICITAR);
                Jugador jugador8 = new Jugador(TipoTrabajador.Jugador, "Lamine Yamal", fechaJugador8, "España",
                                "Yamal", Posicion.Delantero, 11, Traspaso.SINSOLICITAR);
                Jugador jugador9 = new Jugador(TipoTrabajador.Jugador, "Andres Iniesta", fechaJugador9, "España",
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
                System.out.println("La solicitud ha pasado al entrenador:" + entrenador1.getNombre());
                entrenador1.aprobarTraspaso(jugador3);
                System.out.println("La solicitud ha pasado al presidente:" + presidente1.getNombre());
                presidente1.aprobarTraspaso(jugador3);
                jugador3.moverJugador(equipo2);

                System.out.println("-------------------------");

                System.out.println("TRASPASO 2: jugador con entrenador de diferente equipo (rechazado): \n");

                jugador9.jugadorTraspaso();
                System.out.println("La solicitud ha pasado al entrenador:" + entrenador2.getNombre());
                entrenador3.aprobarTraspaso(jugador9);
                System.out.println("La solicitud ha pasado al presidente:" + presidente3.getNombre());
                presidente3.aprobarTraspaso(jugador9);
                jugador5.moverJugador(equipo3);

                System.out.println("-------------------------");

                System.out.println(
                                "TRASPASO 3: jugador con entrenador del mismo equipo , pero con presidente de equipo diferente (rechazado): \n");
                jugador8.jugadorTraspaso();
                System.out.println("La solicitud ha pasado al entrenador:" + entrenador3.getNombre());
                entrenador3.aprobarTraspaso(jugador8);
                System.out.println("La solicitud ha pasado al presidente:" + presidente1.getNombre());
                presidente1.aprobarTraspaso(jugador8);
                jugador8.moverJugador(equipo1);

                System.out.println("-------------------------");

                System.out.println("Total jugadores creados: " + Jugador.getContador());
                System.out.println("Total entrenadores creados: " + Entrenador.getContador());
                System.out.println("Total equipos creados: " + Equipo.getContador());
                System.out.println("Total presidentes creados: " + Presidente.getContador());

                System.out.println("-------------------------");
                System.out.println("PRÁCTICA 6");
                System.out.println(jugador1.mismaNacionalidad(jugador2));
                System.out.println(jugador8.mismaNacionalidad(jugador9));

                System.out.println("-------------------------");
                System.out.println("Probando contadores de Ttrabajador");
                System.out.println("El total de trabajadores es: " + Trabajador.getContadorTrabajadores());
        }

}