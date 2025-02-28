package Jugador;

import java.util.Date;

import Equipo.Equipo;
import Jugador.Traspaso;
import Trabajador.Trabajador;

public class Jugador extends Trabajador {
    private static int contador = 0;

    private String nombreCamiseta;
    private Posicion posicionJugador;
    private int dorsal;
    private Traspaso traspaso;
    private Equipo equipo;

    /**
     * 
     * @param nombre
     * @param fechaNacimiento
     * @param paisOrigen
     * @param nombreCamiseta
     * @param posicionJugador
     * @param dorsal
     * @param traspaso
     */
    public Jugador(String nombre, Date fechaNacimiento, String paisOrigen, String nombreCamiseta,
            Posicion posicionJugador, int dorsal, Traspaso traspaso) {
        super(nombre, fechaNacimiento, paisOrigen);
        this.nombreCamiseta = nombreCamiseta;
        this.posicionJugador = posicionJugador;
        this.dorsal = dorsal;
        this.traspaso = Traspaso.SINSOLICITAR;
        contador++;
    }

    /**
     * 
     * @return El nombre de la camiseta de un jugador
     */
    public String getNombreCamiseta() {
        if (nombreCamiseta == null) {
            System.out.println("El nombre ingresado no es valido");
        }
        return nombreCamiseta;
    }

    /**
     * Pone o modifica el nombre de la camiseta de un jugador
     * 
     * @param NombreCamiseta
     */
    public void setNombreCamiseta(String nombreCamiseta) {
        this.nombreCamiseta = nombreCamiseta;
    }

    /**
     * 
     * @return La fecha de nacimiento de un jugador
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Pone o modifica la fecha de nacimiento ded un jugador
     * 
     * @param FechaNacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * 
     * @return muestra el pais de origen de un jugador
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Pone o modifica el pais de origen de un jugador
     * 
     * @param PaisOrigen
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    /**
     * 
     * @return muestra la posicion de un jugador
     */
    public Posicion getPosicionJugador() {
        return posicionJugador;
    }

    /**
     * Pone o modifica la posicion de un jugador
     * 
     * @param PosicionJugador
     */
    public void setPosicionJugador(Posicion posicionJugador) {
        this.posicionJugador = posicionJugador;
    }

    /**
     * 
     * @return muestra el dorsal de la camisa de un jugador
     * 
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Pone o modifica el dorsal de la camisa de un jugador
     * Contiene una condicion para que el dorsal no pueda ser un numero
     * menor a 0
     * 
     * @param dorsal
     */
    public void setDorsal(int dorsal) {
        if (dorsal < 0) {
            System.out.println("El dorsal es incorrecto");
        }
        this.dorsal = dorsal;
    }

    /**
     * 
     * @return muestra el estado de traspaso de un jugador
     */
    public Traspaso getTraspaso() {
        return traspaso;
    }

    /**
     * Pone o modifia el estado de solicitud de traspaso de un jugador
     * 
     * @param traspasoJugador
     */
    public void setTraspaso(Traspaso traspaso) {
        this.traspaso = traspaso;
    }

    /**
     * 
     * @return El nombre del equipo del jugador
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Pone o modifica el nombre del equipo de un jugador
     * 
     * @param equipo
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * 
     * @return el contador de los jugadores
     */
    public static int getContador() {
        return contador;
    }

    /**
     * Metodo que verifica si el estado del traspaso esta en solicitar y si es así
     * que se cambie a solicitado
     * Y si es igual muestra que ya lo ha solicitado
     */
    public void jugadorTraspaso() {
        System.out.println("El estado actual del traspaso del jugador " + nombreCamiseta + " es: " + traspaso);
        if (getTraspaso() == Traspaso.SINSOLICITAR) {
            traspaso = Traspaso.SOLICITADO;
            System.out.println("El jugador " + nombreCamiseta + " solicita un traspaso de su equipo actual "
                    + equipo.getNombreEquipo());
            System.out.println("El nuevo estado del traspaso es: " + traspaso);
        } else {
            System.out.println("Este jugador ya solicitó un traspaso");
        }
    }

    /**
     * Metodo para mover al jugador
     */
    public void moverJugador(Equipo nuevoEquipo) {
        if (traspaso != Traspaso.APROBADOPRESIDENTE) {
            System.out.println("No se realiza ningun cambio, el traspaso fue rechazado");
        } else {
            if (traspaso == Traspaso.APROBADOPRESIDENTE) {
                equipo.eliminarJugador(this);
                System.out.println("El jugador " + getNombreCamiseta() + " ha sido eliminado de su equipo actual");
            }
            nuevoEquipo.agregarJugador(this);
            traspaso = Traspaso.SINSOLICITAR;
            System.out.println("El jugador " + nombreCamiseta + " se movio al  " + nuevoEquipo.getNombreEquipo());
        }
    }

    /**
     * Metodo toString que permite mostrar los datos de la clase Jugador
     */
    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", nombreCamiseta= " + nombreCamiseta + ",fechaNacimiento="
                + fechaNacimiento + ", paisOrigen="
                + paisOrigen + ", posicionJugador=" + posicionJugador + ", dorsal="
                + dorsal + ", traspaso=" + traspaso + ", equipo=" + equipo + "]";
    }

    /**
     * Metodo que muestra la información del trabajador
     */
    @Override
    public void trabajadorInfo() {
        System.out.println("Nombre: " + nombre + ", Tipo: Jugador");
    }

}
