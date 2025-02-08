package Jugador;

import Equipo.Equipo;
import java.sql.Date;

public class Jugador {
    private String Nombre_camiseta;
    private Date Fecha_nacimiento;
    private String Pais_origen;
    private Posicion Posicion_jugador;
    private int Dorsal;
    private Traspaso Traspaso_jugador;

    private Equipo nombreEquipo;

    public Jugador(String Nombre_camiseta, Date Fecha_nacimiento, String Pais_origen, Posicion Posicion_jugador,
            int Dorsal, Traspaso Traspaso_jugador, Equipo nombreEquipo) {
        this.Nombre_camiseta = Nombre_camiseta;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.Pais_origen = Pais_origen;
        this.Posicion_jugador = Posicion_jugador;
        this.Dorsal = Dorsal;
        this.Traspaso_jugador = Traspaso_jugador;
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombre_camiseta() {
        if (Nombre_camiseta == null) {
            System.out.println("El nombre ingresado no es valido");
        }
        return Nombre_camiseta;
    }

    public void setNombre_camiseta(String Nombre_camiseta) {
        this.Nombre_camiseta = Nombre_camiseta;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public String getPais_origen() {
        return Pais_origen;
    }

    public void setPais_origen(String Pais_origen) {
        this.Pais_origen = Pais_origen;
    }

    public Posicion getPosicion_jugador() {
        return Posicion_jugador;
    }

    public void setPosicion_jugador(Posicion Posicion_jugador) {
        this.Posicion_jugador = Posicion_jugador;
    }

    public int getDorsal() {
        if (Dorsal < 0) {
            System.out.println("El dorsal es incorrecto");
        }
        return Dorsal;
    }

    public void setDorsal(int Dorsal) {
        this.Dorsal = Dorsal;
    }

    public Traspaso getTraspaso_jugador() {
        return Traspaso_jugador;
    }

    public void setTraspaso_jugador(Traspaso Traspaso_jugador) {
        this.Traspaso_jugador = Traspaso_jugador;
    }

    @Override
    public String toString() {
        return "Jugador [Nombre_camiseta= " + Nombre_camiseta + ", Fecha_nacimiento= " + Fecha_nacimiento
                + ", Pais_origen= " + Pais_origen + ", Posicion_jugador= " + Posicion_jugador + ", Dorsal= " + Dorsal
                + ", Traspaso_jugador= " + Traspaso_jugador + "]";
    }

}
