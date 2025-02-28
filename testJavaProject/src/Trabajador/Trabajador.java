package Trabajador;

import java.util.Date;

abstract class Trabajador {
    private String nombreTrabajador;
    private Date fechaNacimiento;
    private String paisOrigen;

    public Trabajador(String nombreTrabajador, Date fechaNacimiento, String paisOrigen) {
        this.nombreTrabajador = nombreTrabajador;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
    }

}
