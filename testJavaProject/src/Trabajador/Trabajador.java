package Trabajador;

import java.util.Date;

public abstract class Trabajador {
    protected String nombre;
    protected Date fechaNacimiento;
    protected String paisOrigen;

    /**
     * 
     * @param nombre          Nombre del trabajador
     * @param fechaNacimiento fecha de nacimiento del trabajador
     * @param paisOrigen      Pais origen del trabajador
     */
    public Trabajador(String nombre, Date fechaNacimiento, String paisOrigen) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
    }

    /**
     * 
     * @return muestra el nombre del trabajador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Pone o modifica el nombre del trabajador
     * 
     * @param Nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return muestra la fecha de nacimiento del trabajador
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Pone o modifica la fecha de nacimiento del trabajador
     * 
     * @param FechaNacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * 
     * @return muestra el pais de origen del trabajador
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Pone o modifica el pais de origen del trabajador
     * 
     * @param PaisOrigen
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    /**
     * Método abstracto a implementar en las subclases
     */
    public abstract void trabajadorInfo();

    /**
     * Método para comparar si dos trabajadores tienen la misma nacionalidad
     */
    public String comparaNacionalidad(Trabajador jugadorCompara) {
        if (this.paisOrigen.equalsIgnoreCase(jugadorCompara.paisOrigen)) {
            return "Jugador " + this.getNombre() + " tiene la misma nacionalidad que " + jugadorCompara.getNombre();
        } else {
            return "Jugador " + this.getNombre() + " tiene diferente nacionalidad que " + jugadorCompara.getNombre();
        }
    }

}
