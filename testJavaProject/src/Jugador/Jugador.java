package Jugador;

import java.sql.Date;

import Equipo.Equipo;
import Jugador.Traspaso;;

public class Jugador {
    public static Traspaso getTraspaso_jugador;
    public static Equipo getnombreEquipo;
    private String Nombre_camiseta;
    private Date Fecha_nacimiento;
    private String Pais_origen;
    private Posicion Posicion_jugador;
    private int Dorsal;
    private Traspaso Traspaso_jugador;
    private Equipo nombreEquipo;

    /**
     * Constructor del nuevo jugador
     * 
     * @param Nombre_camiseta
     * @param Fecha_nacimiento
     * @param Pais_origen
     * @param Posicion_jugador
     * @param Dorsal
     * @param Traspaso_jugador
     */
    public Jugador(String Nombre_camiseta, Date Fecha_nacimiento, String Pais_origen, Posicion Posicion_jugador,
            int Dorsal, Traspaso Traspaso_jugador) {
        this.Nombre_camiseta = Nombre_camiseta;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.Pais_origen = Pais_origen;
        this.Posicion_jugador = Posicion_jugador;
        this.Dorsal = Dorsal;
        this.Traspaso_jugador = Traspaso.SINSOLICITAR;
    }

    /**
     * 
     * @return El nombre de la camiseta de un jugador
     */
    public String getNombre_camiseta() {
        if (Nombre_camiseta == null) {
            System.out.println("El nombre ingresado no es valido");
        }
        return Nombre_camiseta;
    }

    /**
     * Pone o modifica el nombre de la camiseta de un jugador
     * 
     * @param Nombre_camiseta
     */
    public void setNombre_camiseta(String Nombre_camiseta) {
        this.Nombre_camiseta = Nombre_camiseta;
    }

    /**
     * 
     * @return La fecha de nacimiento de un jugador
     */
    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    /**
     * Pone o modifica la fecha de nacimiento ded un jugador
     * 
     * @param Fecha_nacimiento
     */
    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    /**
     * 
     * @return muestra el pais de origen de un jugador
     */
    public String getPais_origen() {
        return Pais_origen;
    }

    /**
     * Pone o modifica el pais de origen de un jugador
     * 
     * @param Pais_origen
     */
    public void setPais_origen(String Pais_origen) {
        this.Pais_origen = Pais_origen;
    }

    /**
     * 
     * @return muestra la posicion de un jugador
     */
    public Posicion getPosicion_jugador() {
        return Posicion_jugador;
    }

    /**
     * Pone o modifica la posicion de un jugador
     * 
     * @param Posicion_jugador
     */
    public void setPosicion_jugador(Posicion Posicion_jugador) {
        this.Posicion_jugador = Posicion_jugador;
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
    public Traspaso getTraspaso_jugador() {
        return Traspaso_jugador;
    }

    /**
     * Pone o modifia el estado de solicitud de traspaso de un jugador
     * 
     * @param Traspaso_jugador
     */
    public void setTraspaso_jugador(Traspaso Traspaso_jugador) {
        this.Traspaso_jugador = Traspaso_jugador;
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
        System.out.println("El estado actual del traspaso es: " + Traspaso_jugador);
        if (Traspaso_jugador == Traspaso.SINSOLICITAR) {
            Traspaso_jugador = Traspaso.SOLICITADO;
            System.out.println("El jugador " + Nombre_camiseta + "solicita un traspaso.");
            System.out.println("El nuevo estado del traspaso es: " + Traspaso_jugador);
        } else {
            System.out.println("Este jugador ya solicitó un traspaso");
        }

    }

    /**
     * Metodo toString que permite mostrar los datos de la clase Jugador
     */
    @Override
    public String toString() {
        return "Jugador [Nombre_camiseta= " + Nombre_camiseta + ", Fecha_nacimiento= " + Fecha_nacimiento
                + ", Pais_origen= " + Pais_origen + ", Posicion_jugador= " + Posicion_jugador + ", Dorsal= " + Dorsal
                + ", Traspaso_jugador= " + Traspaso_jugador + "]";
    }

}
