import java.sql.Date;

public class Jugador {
    private String Nombre_camiseta;
    private Date Fecha_nacimiento;
    private String Pais_origen;
    private Posicion Posicion_jugador;
    private int Dorsal;
    private Traspaso Traspaso_jugador;

    public Jugador(String Nombre_camiseta, Date Fecha_nacimiento, String Pais_origen, Posicion Posicion_jugador,
            int Dorsal, Traspaso Traspaso_jugador) {
        this.Nombre_camiseta = Nombre_camiseta;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.Pais_origen = Pais_origen;
        this.Posicion_jugador = Posicion_jugador;
        this.Dorsal = Dorsal;
        this.Traspaso_jugador = Traspaso_jugador;
    }

}
