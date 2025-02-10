package Jugador;

import java.sql.Date;

import Equipo.Equipo;
import Jugador.Traspaso;

public class Jugador {
    private String nombreCamiseta;
    private Date fechaNacimiento;
    private String paisOrigen;
    private Posicion posicionJugador;
    private int Dorsal;
    private Traspaso traspasoJugador;
    private Equipo nombreEquipo;

    /**
     * Constructor del nuevo jugador
     * 
     * @param nombreCamiseta
     * @param fechaNacimiento
     * @param paisOrigen
     * @param posicionJugador
     * @param Dorsal
     * @param traspasoJugador
     */
    public Jugador(String nombreCamiseta, Date fechaNacimiento, String paisOrigen, Posicion posicionJugador,
            int Dorsal, Traspaso traspasoJugador) {
        this.nombreCamiseta = nombreCamiseta;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
        this.posicionJugador = posicionJugador;
        this.Dorsal = Dorsal;
        this.traspasoJugador = Traspaso.SINSOLICITAR;
    }

    /**
     * 
     * @return El nombre de la camiseta de un jugador
     */
    public String getnombreCamiseta() {
        if (nombreCamiseta == null) {
            System.out.println("El nombre ingresado no es valido");
        }
        return nombreCamiseta;
    }

    /**
     * Pone o modifica el nombre de la camiseta de un jugador
     * 
     * @param nombreCamiseta
     */
    public void setnombreCamiseta(String nombreCamiseta) {
        this.nombreCamiseta = nombreCamiseta;
    }

    /**
     * 
     * @return La fecha de nacimiento de un jugador
     */
    public Date getfechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Pone o modifica la fecha de nacimiento ded un jugador
     * 
     * @param fechaNacimiento
     */
    public void setfechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * 
     * @return muestra el pais de origen de un jugador
     */
    public String getpaisOrigen() {
        return paisOrigen;
    }

    /**
     * Pone o modifica el pais de origen de un jugador
     * 
     * @param paisOrigen
     */
    public void setpaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    /**
     * 
     * @return muestra la posicion de un jugador
     */
    public Posicion getposicionJugador() {
        return posicionJugador;
    }

    /**
     * Pone o modifica la posicion de un jugador
     * 
     * @param posicionJugador
     */
    public void setposicionJugador(Posicion posicionJugador) {
        this.posicionJugador = posicionJugador;
    }

    /**
     * 
     * @return muestra el dorsal de la camisa de un jugador
     *         Contiene una condicion para que el dorsal no pueda ser un numero
     *         menor a 0
     */
    public int getDorsal() {
        if (Dorsal < 0) {
            System.out.println("El dorsal es incorrecto");
        }
        return Dorsal;
    }

    /**
     * Pone o modifica el dorsal de la camisa de un jugador
     * 
     * @param Dorsal
     */
    public void setDorsal(int Dorsal) {
        this.Dorsal = Dorsal;
    }

    /**
     * 
     * @return muestra el estado de traspaso de un jugador
     */
    public Traspaso gettraspasoJugador() {
        return traspasoJugador;
    }

    /**
     * Pone o modifia el estado de solicitud de traspaso de un jugador
     * 
     * @param traspasoJugador
     */
    public void settraspasoJugador(Traspaso traspasoJugador) {
        this.traspasoJugador = traspasoJugador;
    }

    /**
     * 
     * @return El nombre del equipo del jugador
     */
    public Equipo getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * Pone o modifica el nombre del equipo de un jugador
     * 
     * @param nombreEquipo
     */
    public void setNombreEquipo(Equipo nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * Metodo que verifica si el estado del traspaso esta en solicitar y si es así
     * que se cambie a solicitado
     * Y si es igual muestra que ya lo ha solicitado
     */
    public void jugadorTraspaso() {
        System.out.println("El estado actual del traspaso es: " + traspasoJugador);
        if (traspasoJugador == Traspaso.SINSOLICITAR) {
            traspasoJugador = Traspaso.SOLICITADO;
            System.out.println("El jugador " + nombreCamiseta + "solicita un traspaso.");
            System.out.println("El nuevo estado del traspaso es: " + traspasoJugador);
        } else {
            System.out.println("Este jugador ya solicitó un traspaso");
        }

    }

    /**
     * Metodo toString que permite mostrar los datos de la clase Jugador
     */
    @Override
    public String toString() {
        return "Jugador [nombreCamiseta= " + nombreCamiseta + ", fechaNacimiento= " + fechaNacimiento
                + ", paisOrigen= " + paisOrigen + ", posicionJugador= " + posicionJugador + ", Dorsal= " + Dorsal
                + ", traspasoJugador= " + traspasoJugador + "]";
    }

}
